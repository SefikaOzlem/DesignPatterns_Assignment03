package org.egitim.creational_Factory.domain;

public class PopMusic implements IMusic {

	private String name;
	private String companyName;

	/*Constructor*/
	public PopMusic(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	
	@Override
	public void playInformation() {

		System.out.println("Music Type: Pop Music " + '\n' + "Music Name: " + name + "\n" + companyName);

	}


	@Override
	public String name() {
		
		return this.name;
	}


	@Override
	public String companyName() {
		
		return this.companyName;
	}

}
