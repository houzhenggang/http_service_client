package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderAlbumSummary;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TaohuaAudioreaderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1542212756822969571L;

	/** 
	 * ��������ר��ժҪ�б�
	 */
	@ApiListField("audioreader_search_results")
	@ApiField("taohua_audio_reader_album_summary")
	private List<TaohuaAudioReaderAlbumSummary> audioreaderSearchResults;

	/** 
	 * �������ص�ר������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAudioreaderSearchResults(List<TaohuaAudioReaderAlbumSummary> audioreaderSearchResults) {
		this.audioreaderSearchResults = audioreaderSearchResults;
	}
	public List<TaohuaAudioReaderAlbumSummary> getAudioreaderSearchResults( ) {
		return this.audioreaderSearchResults;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
