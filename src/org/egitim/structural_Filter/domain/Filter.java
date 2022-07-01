package org.egitim.structural_Filter.domain;

import java.util.List;

public interface Filter 
{
	//Filmlerin "Film" tipinde filtrelenmesi
	public List<Movie> filterList(List<Movie> movies);
}
