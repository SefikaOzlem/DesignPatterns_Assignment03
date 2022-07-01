package org.egitim.behavioral_Iterator.domain;

import java.util.Scanner;

public class PlayMusicStore {

	private PlayMusic[] musics=null;

	/*Music is added to the playlist. New PlayMusic type objects are assigned to the "i" index of the PlayMusic type variable 
	 * until the loop ends.*/	
	public PlayMusicStore() {
		musics = new PlayMusic[4];
		String name = "";
		String type = "";
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < musics.length; i++) {
			name = scn.nextLine();
			type = scn.nextLine();
			musics[i] = new PlayMusic(name, type);
		}
	}

	public Iterator iterator() { //A MusicIterator object is created to cycle through the elements of the Music list in order.
		return new MusicIterator(musics);
	}

}
