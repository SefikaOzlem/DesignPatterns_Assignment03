package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class IsHigh_imdb implements Filter{
	@Override
	public List<Movie> filterList(List<Movie> movies) {

		List<Movie> isHighImdbList = new ArrayList<Movie>();
		
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getImdb() > 8.4)
			{
				isHighImdbList.add(movies.get(i));
			}
		}
		return isHighImdbList;
	}


}
