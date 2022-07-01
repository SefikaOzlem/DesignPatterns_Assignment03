package org.egitim.structural_Filter.domain;

import java.util.ArrayList;
import java.util.List;

public class ActionType implements Filter {

	@Override
	public List<Movie> filterList(List<Movie> movies) {  // Aksiyon türündeki filmlerin listelenmesi

		List<Movie> actionTypeList = new ArrayList<Movie>();
		
		for (int i = 0; i < movies.size(); i++)
		{
			if (movies.get(i).getType().equalsIgnoreCase("Action"))
			{
				actionTypeList.add(movies.get(i));
			}
		}
		return actionTypeList;
	}

}