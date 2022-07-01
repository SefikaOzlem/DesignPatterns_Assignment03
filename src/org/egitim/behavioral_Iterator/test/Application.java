package org.egitim.behavioral_Iterator.test;

import org.egitim.behavioral_Iterator.domain.Iterator;
import org.egitim.behavioral_Iterator.domain.PlayMusic;
import org.egitim.behavioral_Iterator.domain.PlayMusicStore;

// Iterator Pattern was selected from Behavioral Design Patterns
public class Application {

	public static void main(String[] args) {
		PlayMusicStore playMusicStore = new PlayMusicStore();
		Iterator iterator = playMusicStore.iterator();
		System.out.print(iterator.hasNext());
		
		PlayMusic tempMusic=null;
		while (iterator.hasNext()) {
			tempMusic=iterator.next();
			System.out.println(tempMusic.getMusicName() +" -" +tempMusic.getMusicType());
		}
	}
}
