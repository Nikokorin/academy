package homework_4;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
	
	private T[] array;
	private int index;

	public MyIterator() {
		super();
	}

	public MyIterator(T[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || array.length <= index) {
			return false;
		}
		return array[index] != null;
	}

	@Override
	public T next() {
		return array[index++];
	}


}
