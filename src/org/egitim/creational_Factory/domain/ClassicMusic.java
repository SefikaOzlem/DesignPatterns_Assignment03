package org.egitim.creational_Factory.domain;

public class ClassicMusic implements IMusic {

	private String name;
	private String companyName;

	/*Constructor*/
	public ClassicMusic(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	@Override
	public String name() {
		
		return this.name;
	}

	@Override
	public String companyName() {
		
		return this.companyName;
	}

	@Override
	public void playInformation() {

		System.out.println("Music Type: Classic Music " + '\n' + "Music Name: " + name + "\n" + companyName);

	}
}
