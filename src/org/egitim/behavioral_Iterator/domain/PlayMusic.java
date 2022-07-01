package org.egitim.behavioral_Iterator.domain;

public class PlayMusic {
	
	private String musicName;
	private String musicType;
	
	/*Constructor*/
	public PlayMusic(String musicName,String type) {
		
		super();
		this.setMusicName(musicName);
		this.musicType=type;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicType() {
		return musicType;
	}

	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}

}
