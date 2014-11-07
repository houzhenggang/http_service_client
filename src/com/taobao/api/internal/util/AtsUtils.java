package com.taobao.api.internal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.taobao.api.ApiException;

/**
 * �첽API���ع����ࡣ
 * 
 * @author carver.gu
 * @since 1.0, Dec 1, 2010
 */
public abstract class AtsUtils {

	private static final String CTYPE_OCTET = "application/octet-stream";
	private static final Pattern REGEX_FILE_NAME = Pattern.compile("attachment;filename=\"([\\w\\-]+)\"");

	private AtsUtils() {
	}

	/**
	 * ��ѹgzip�ļ���ָ����Ŀ¼��Ŀǰֻ�ܽ�ѹgzip������ֻ����һ���ļ���ѹ������
	 * 
	 * @param gzip ��Ҫ��ѹ��gzip�ļ�
	 * @param toDir ��Ҫ��ѹ����Ŀ¼
	 * @return ��ѹ����ļ�
	 * @throws IOException
	 */
	public static File ungzip(File gzip, File toDir) throws IOException {
		toDir.mkdirs();
		File out = new File(toDir, gzip.getName());
		GZIPInputStream gin = null;
		FileOutputStream fout = null;
		try {
			FileInputStream fin = new FileInputStream(gzip);
			gin = new GZIPInputStream(fin);
			fout = new FileOutputStream(out);
			copy(gin, fout);
			gin.close();
			fout.close();
		} finally {
			closeQuietly(gin);
			closeQuietly(fout);
		}
		return out;
	}

	/**
	 * ��ѹzip�ļ���ָ����Ŀ¼��
	 * 
	 * @param zip ��Ҫ��ѹ��zip�ļ�
	 * @param toDir ��Ҫ��ѹ����Ŀ¼
	 * @return ��ѹ����ļ��б��������ļ��У�
	 */
	public static List<File> unzip(File zip, File toDir) throws IOException {
		List<File> files = new ArrayList<File>();
		ZipFile zf = new ZipFile(zip);
		Enumeration<?> entries = zf.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			if (entry.isDirectory()) {
				new File(toDir, entry.getName()).mkdirs();
				continue;
			}

			InputStream input = null;
			OutputStream output = null;
			try {
				File f = new File(toDir, entry.getName());
				input = zf.getInputStream(entry);
				output = new FileOutputStream(f);
				copy(input, output);
				files.add(f);
			} finally {
				closeQuietly(output);
				closeQuietly(input);
			}
		}
		return files;
	}

	/**
	 * ͨ��HTTP GET��ʽ�����ļ���ָ����Ŀ¼��
	 * 
	 * @param url ��Ҫ���ص�URL
	 * @param toDir ��Ҫ���ص���Ŀ¼
	 * @return ���غ���ļ�
	 */
	public static File download(String url, File toDir) throws ApiException {
		toDir.mkdirs();
		HttpURLConnection conn = null;
		OutputStream output = null;
		File file = null;
		try {
			conn = getConnection(new URL(url));
			String ctype = conn.getContentType();
			if (CTYPE_OCTET.equals(ctype)) {
				String fileName = getFileName(conn);
				file = new File(toDir, fileName);
				output = new FileOutputStream(file);
				copy(conn.getInputStream(), output);
			} else {
				String rsp = WebUtils.getResponseAsString(conn);
				throw new ApiException(rsp);
			}
		} catch (IOException e) {
			throw new ApiException(e.getMessage());
		} finally {
			closeQuietly(output);
			if (conn != null) {
				conn.disconnect();
			}
		}
		return file;
	}

	private static String getFileName(HttpURLConnection conn) {
		String fileName = conn.getHeaderField("Content-Disposition");
		Matcher matcher = REGEX_FILE_NAME.matcher(fileName);
		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return null;
		}
	}

	private static HttpURLConnection getConnection(URL url) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "application/zip;text/html");
		return conn;
	}

	private static int copy(InputStream input, OutputStream output) throws IOException {
		long count = copyStream(input, output);
		if (count > Integer.MAX_VALUE) {
			return -1;
		}
		return (int) count;
	}

	private static long copyStream(InputStream input, OutputStream output) throws IOException {
		byte[] buffer = new byte[1024];
		long count = 0;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}

	private static void closeQuietly(OutputStream output) {
		try {
			if (output != null) {
				output.close();
			}
		} catch (IOException ioe) {
			// ignore
		}
	}

	private static void closeQuietly(InputStream input) {
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException ioe) {
			// ignore
		}
	}

}
