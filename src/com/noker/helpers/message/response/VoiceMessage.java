package com.noker.helpers.message.response;

import com.noker.helpers.message.model.Voice;

/*������Ϣ*/
public class VoiceMessage extends BaseMessage{
	private Voice Voice;// ����

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
