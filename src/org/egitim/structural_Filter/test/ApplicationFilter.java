package org.egitim.structural_Filter.test;

import java.util.ArrayList;
import java.util.List;

import org.egitim.structural_Filter.FilterOperations.AndFilterOperation;
import org.egitim.structural_Filter.FilterOperations.OrFilterOperation;
import org.egitim.structural_Filter.domain.ActionType;
import org.egitim.structural_Filter.domain.AfterTwoThousand;
import org.egitim.structural_Filter.domain.BeforeTwoThousand;
import org.egitim.structural_Filter.domain.CrimeType;
import org.egitim.structural_Filter.domain.DramaType;
import org.egitim.structural_Filter.domain.Filter;
import org.egitim.structural_Filter.domain.IsHigh_imdb;
import org.egitim.structural_Filter.domain.Movie;

//Filter Pattern was selected from Structural Design Patterns
public class ApplicationFilter {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		 
		movies.add(new Movie("The Prestige", 2006,"Drama",8.5));
		movies.add(new Movie("Titanic",1997, "Drama",7.9));
		movies.add(new Movie("Pulp Fiction", 1994, "Crime",8.9));
		movies.add(new Movie("V For Vendatta", 2005, "Action",8.2));
		movies.add(new Movie("The Pianist",2002, "Drama",9.1));
		movies.add(new Movie("The Dark Knight Rises", 2012, "Crime",8.4));
		movies.add(new Movie("Inception",2010, "Action",8.8));
 
        Filter imdb = new IsHigh_imdb();
        System.out.println("List of movies with high imdb: ");
        printList(imdb.filterList(movies));
        
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter drama = new DramaType();
        System.out.println("List of drama movies : ");
        printList(drama.filterList(movies));
         
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter crime = new CrimeType();
        System.out.println("List of crime movies: ");
        printList(crime.filterList(movies));
        
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter action = new ActionType();
        System.out.println("List of action movies: ");
        printList(action.filterList(movies));
        
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter beforeTwoThousands = new BeforeTwoThousand();
        System.out.println("List of before-twoThousands movies: ");
        printList(beforeTwoThousands.filterList(movies));
         
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter afterTwoThousands = new AfterTwoThousand();
        System.out.println("List of after-TwoThousands movies: ");
        printList(afterTwoThousands.filterList(movies));
         
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter aciton_highImdb = new AndFilterOperation(action, imdb);
        System.out.println("List of action and high imdb movies: ");
        printList(aciton_highImdb.filterList(movies));
        
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter drama_afterTwoThs = new AndFilterOperation(drama, afterTwoThousands);
        System.out.println("List of drama and after TwoThousands movies: ");
        printList(drama_afterTwoThs.filterList(movies));
         
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter drama_Or_crime = new OrFilterOperation(drama, crime);
        System.out.println("List of dramas or crimes: ");
        printList(drama_Or_crime.filterList(movies));
       
        System.out.println("\n * * * * * * * * * * * * * * * * *  \n");
        
        Filter highImdb_or_beforeTwoThsnds = new OrFilterOperation(imdb, beforeTwoThousands);
        System.out.println("List of high imdbs or  before TwoThousands: ");
        printList(highImdb_or_beforeTwoThsnds.filterList(movies));
         

	}

	public static void printList(List<Movie> movies) {
		
		 for (Movie movie : movies) {
			System.out.println("Movie Name :"+movie.getMovieName()+"- "+movie.getVisionYear()
					+"- "+movie.getType()+" - "+movie.getImdb());
		} 
		
	}

}
