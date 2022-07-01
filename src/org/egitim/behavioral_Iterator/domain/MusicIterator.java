package org.egitim.behavioral_Iterator.domain;

public class MusicIterator implements Iterator {

	private PlayMusic[] musics = null; // temp to musics in the list
	
	private int index = 0;

	public MusicIterator(PlayMusic[] musics) {
		super();
		this.musics = musics;
	}

	
	/*The index of the last element of the list is compared to the total number of elements in the list.
	 *  If the index is less than the number of elements, the list has a continuation.*/
	@Override
	public boolean hasNext() 
	{  
		boolean flag;
		if (index < musics.length) 
		{
			flag = true;
		} else
			flag = false;

		return flag;
	}

	/*Returns the element of type PlayMusic according to the index and increases the index to move to the next element.*/
	@Override
	public PlayMusic next() 
	{
		
		PlayMusic music = musics[index];
		index++;
		return music;
	}

	
}
