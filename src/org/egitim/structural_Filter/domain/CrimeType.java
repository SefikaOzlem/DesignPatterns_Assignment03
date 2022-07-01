package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class CrimeType implements Filter {

	@Override
	public List<Movie> filterList(List<Movie> movies) {

		List<Movie> crimeTypeList = new ArrayList<Movie>();
		
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getType().equalsIgnoreCase("Crime"))
			{
				crimeTypeList.add(movies.get(i));
			}
		}
		return crimeTypeList;
	}

}
