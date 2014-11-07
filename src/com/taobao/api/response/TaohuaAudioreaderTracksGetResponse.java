package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderTrack;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.tracks.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class TaohuaAudioreaderTracksGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7848394272365282332L;

	/** 
	 * �������ﵥ���б�
	 */
	@ApiListField("audioreader_tracks")
	@ApiField("taohua_audio_reader_track")
	private List<TaohuaAudioReaderTrack> audioreaderTracks;

	/** 
	 * ר���ڵĵ�������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAudioreaderTracks(List<TaohuaAudioReaderTrack> audioreaderTracks) {
		this.audioreaderTracks = audioreaderTracks;
	}
	public List<TaohuaAudioReaderTrack> getAudioreaderTracks( ) {
		return this.audioreaderTracks;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
