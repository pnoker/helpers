package com.noker.helpers.message.response;

import com.noker.helpers.message.model.Video;

/*视频消息*/
public class VideoMessage extends BaseMessage{
	private Video Video;// 视频

	public Video getVideo() {
		return Video;
	}

	public void setVideo(Video video) {
		Video = video;
	}
}
