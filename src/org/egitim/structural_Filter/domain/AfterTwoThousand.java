package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class AfterTwoThousand implements Filter 
{

	@Override
	public List<Movie> filterList(List<Movie> movies) {  // 2000ler sonrası vizyon tarihindeki filmlerin listelenmesi 
		
		List<Movie> afterTwoList = new ArrayList<Movie>(); 
        
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getVisionYear() >= 2000)
			{
				afterTwoList.add(movies.get(i));
			}
		}
		return afterTwoList;
	}

}
