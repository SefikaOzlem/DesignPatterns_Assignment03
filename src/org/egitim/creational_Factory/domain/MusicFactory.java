package org.egitim.creational_Factory.domain;

public class MusicFactory {

	public static IMusic musicFactory(String musicType, String musicName, String companyName) { 

		IMusic music = null;      

		/*If there is "Pop" in the constructor of the object to be created in IMusic type, 
		 * that is, if pop music is desired to be created, the "Pop" object is created.*/	
		if (musicType.equals("Pop")) {   // 
			music = new PopMusic(musicName, companyName);
		}
		
		/*If there is "Jazz" in the constructor of the object to be created in IMusic type, 
		 * that is, if jazz music is desired to be created, the "Jazz" object is created.*/	
		else if (musicType.equals("Jazz")) {
			music = new JazzMusic(musicName, companyName);
		}
		
		/*If there is "Classic" in the constructor of the object to be created in IMusic type, 
		 * that is, if classic music is desired to be created, the "Classic" object is created.*/	
		else if (musicType.equals("Classic")) {
			music = new ClassicMusic(musicName, companyName);
		}
		
		return music;
	}
}
