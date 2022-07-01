package org.egitim.structural_Filter.FilterOperations;

import java.util.ArrayList;
import java.util.List;

import org.egitim.structural_Filter.domain.Filter;
import org.egitim.structural_Filter.domain.Movie;

public class OrFilterOperation implements Filter {

	private Filter selectOne;
	private Filter selectTwo;

	/*Constructor*/
	public OrFilterOperation(Filter selectOne, Filter selectTwo) {
		this.selectOne = selectOne;
		this.selectTwo = selectTwo;
	}

	@Override
	public List<Movie> filterList(List<Movie> movies) {
		
		List<Movie> orFilter = new ArrayList<Movie>();

		List<Movie> firstList = selectOne.filterList(movies); // list of results according to the filter of the first selection
		List<Movie> secondList = selectTwo.filterList(movies); //list of results according to the filter of the second selection

		orFilter = firstList;

		/*If there are no elements of the second list in the First List, it is assigned to the "or" list.*/
		for (int i = 0; i < secondList.size(); i++) 
		{
			if (!orFilter.contains(secondList.get(i))) 
			{
				orFilter.add(secondList.get(i));
			}
		}

		return orFilter;
	}

}