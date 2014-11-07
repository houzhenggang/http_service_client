package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderAlbumSummary;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.recommend.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:51.0
 */
public class TaohuaAudioreaderRecommendGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7771945382786363516L;

	/** 
	 * ��������ר��ժҪ�б�
	 */
	@ApiListField("audioreader_summaries")
	@ApiField("taohua_audio_reader_album_summary")
	private List<TaohuaAudioReaderAlbumSummary> audioreaderSummaries;

	/** 
	 * ����������ר������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAudioreaderSummaries(List<TaohuaAudioReaderAlbumSummary> audioreaderSummaries) {
		this.audioreaderSummaries = audioreaderSummaries;
	}
	public List<TaohuaAudioReaderAlbumSummary> getAudioreaderSummaries( ) {
		return this.audioreaderSummaries;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
