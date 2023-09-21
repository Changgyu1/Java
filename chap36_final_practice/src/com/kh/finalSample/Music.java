package com.kh.finalSample;

public class Music {
	private String music;
	private String emotion;

	public Music(String music, String emotion) {
		this.music = music;
		this.emotion = emotion;
	}

	public String getMusic() {
		return music;
	}

	public String getEmotion() {
		return emotion;
	}

	public String toString() {
		return music + emotion;
	}

}
