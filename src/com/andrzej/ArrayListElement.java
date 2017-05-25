package com.andrzej;

/**
 * Created by andrzej on 24.05.17.
 */
public class ArrayListElement<DataType> {
	private ArrayListElement previous;
	private DataType data;
	private ArrayListElement next;

	public ArrayListElement( DataType data) {
		this.data = data;

	}

	public ArrayListElement getPrevious() {
		return previous;
	}

	public DataType getData() {
		return data;
	}

	public void setPrevious(ArrayListElement previous) {
		this.previous = previous;
	}

	public void setData(DataType data) {
		this.data = data;
	}

	public ArrayListElement getNext() {
		return next;
	}

	public void setNext(ArrayListElement next) {
		this.next = next;
	}
}
