package com.noker.helpers.message.model;

/*����model*/
public class Music {
	private String Title;// ���ֱ���
	private String Description;// ��������
	private String MusicUrl;// �������������ӣ�WiFi��������ʹ�ø����ӵ�����
	private String HQMusicUrl;// ����ͼ��ý��ID��ͨ���ϴ���ý���ļ��õ���ID

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMusicUrl() {
		return MusicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}

}
