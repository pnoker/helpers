package com.noker.helpers.message.response;

import com.noker.helpers.message.model.Video;

/*��Ƶ��Ϣ*/
public class VideoMessage extends BaseMessage{
	private Video Video;// ��Ƶ

	public Video getVideo() {
		return Video;
	}

	public void setVideo(Video video) {
		Video = video;
	}
}
