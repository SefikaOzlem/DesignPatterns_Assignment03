package org.egitim.structural_Filter.FilterOperations;

import java.util.ArrayList;
import java.util.List;

import org.egitim.structural_Filter.domain.Filter;
import org.egitim.structural_Filter.domain.Movie;

public class AndFilterOperation implements Filter {

	private Filter selectOne;
	private Filter selectTwo;

	/*Constructor*/
	public AndFilterOperation(Filter selectOne, Filter selectTwo) {
		this.selectOne = selectOne;
		this.selectTwo = selectTwo;
	}

	@Override
	public List<Movie> filterList(List<Movie> movie) {
		
		 List<Movie> andFilter = new ArrayList<Movie>();
         
		 /*first the second selection is filtered and the resulting list is filtered in the first option.*/
		 andFilter = selectOne.filterList(selectTwo.filterList(movie)); 
         
         return andFilter;
	}

	
}
