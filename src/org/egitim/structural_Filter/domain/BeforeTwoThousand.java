package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class BeforeTwoThousand implements Filter
{

	@Override
	public List<Movie> filterList(List<Movie> movies) {
		
		List<Movie> beforeTwoList = new ArrayList<Movie>(); 
        
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getVisionYear() < 2000)
			{
				beforeTwoList.add(movies.get(i));
			}
		}
		return beforeTwoList;
	}

}