package com.noker.helpers.message.event;

/*�ϱ�����λ���¼�*/
public class LocationEvent extends BaseEvent {
	private String Latitude;// ����λ��γ��
	private String Longitude;// ����λ�þ���
	private String Precision;// ����λ�õľ�ȷ��

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getPrecision() {
		return Precision;
	}

	public void setPrecision(String precision) {
		Precision = precision;
	}

}
