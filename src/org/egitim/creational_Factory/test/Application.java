package org.egitim.creational_Factory.test;

import org.egitim.creational_Factory.domain.IMusic;
import org.egitim.creational_Factory.domain.MusicFactory;

//Factory Pattern was selected from Creational Design Patterns
public class Application {

	public static void main(String[] args) {
		
		IMusic pop=MusicFactory.musicFactory("Pop", "AAA", "A1Company");
		
		IMusic classic=MusicFactory.musicFactory("Classic", "BBB", "B1Company");
		
		pop.playInformation();
	}
}
