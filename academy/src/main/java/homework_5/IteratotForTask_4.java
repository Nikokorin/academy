package homework_5;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratotForTask_4<T> implements Iterator<T> {
	
	private ArrayList<T> array;
	private int index;

	public IteratotForTask_4() {
		super();
	}

	public IteratotForTask_4(ArrayList<T> array) {
		super();
		this.array = array;
	}


	@Override
	public boolean hasNext() {
		if (array == null || array.size() <= index) {
			return false;
		}
		return array.get(index) != null;
	}

	@Override
	public T next() {
		return array.get(index++);
	}
	
	

}
