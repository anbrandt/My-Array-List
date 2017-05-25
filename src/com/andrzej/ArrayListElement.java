package com.andrzej;

/**
 * Created by andrzej on 24.05.17.
 */
public class ArrayListElement {
	private ArrayListElement previous;
	private Object data;
	private ArrayListElement next;

	public ArrayListElement( Object data) {

		this.data = data;

	}

	public ArrayListElement getPrevious() {
		return previous;
	}

	public Object getData() {
		return data;
	}

	public void setPrevious(ArrayListElement previous) {
		this.previous = previous;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ArrayListElement getNext() {
		return next;
	}

	public void setNext(ArrayListElement next) {
		this.next = next;
	}
}
