package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class DramaType implements Filter {

	@Override
	public List<Movie> filterList(List<Movie> movies) {

		List<Movie> dramaTypeList = new ArrayList<Movie>();
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getType().equalsIgnoreCase("Drama")) {
				dramaTypeList.add(movies.get(i));
			}
		}
		return dramaTypeList;
	}

}
