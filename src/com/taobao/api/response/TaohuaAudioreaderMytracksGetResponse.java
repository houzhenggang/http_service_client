package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.TaohuaAudioReaderTrack;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.mytracks.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:37.0
 */
public class TaohuaAudioreaderMytracksGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3313131578426638442L;

	/** 
	 * �ҵ�������ⵥ���б�
	 */
	@ApiListField("my_audioreader_tracks")
	@ApiField("taohua_audio_reader_track")
	private List<TaohuaAudioReaderTrack> myAudioreaderTracks;

	/** 
	 * �ҵ�������ⵥ����
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMyAudioreaderTracks(List<TaohuaAudioReaderTrack> myAudioreaderTracks) {
		this.myAudioreaderTracks = myAudioreaderTracks;
	}
	public List<TaohuaAudioReaderTrack> getMyAudioreaderTracks( ) {
		return this.myAudioreaderTracks;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
