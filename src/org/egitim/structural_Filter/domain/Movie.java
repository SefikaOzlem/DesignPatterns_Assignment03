package org.egitim.structural_Filter.domain;

public class Movie {

	private String movieName;
	private int visionYear;
	private String type;
	private double imdb;

	public Movie(String movieName, int visionYear, String type, double imdb) {

		this.movieName = movieName;
		this.visionYear = visionYear;
		this.type = type;
		this.imdb = imdb;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getVisionYear() {
		return visionYear;
	}

	public void setVisionYear(int visionYear) {
		this.visionYear= visionYear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}
}
