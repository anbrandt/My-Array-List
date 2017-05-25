package com.andrzej;

import javax.xml.crypto.Data;
import java.util.ArrayList;

/**
 * Created by andrzej on 24.05.17.
 */
public class ArrayMethods<DataType> { //generics here!
	private ArrayListElement firstElement; //create a reference to the first added element
	private ArrayListElement lastAddedElement; //create a reference to the last added element
	private int size; //for getSize method, used in addtoArray this.size++ - much quicker, SMART!

	public void addToArray(DataType data) {
		ArrayListElement<DataType> item = new ArrayListElement<DataType>(data);

		if (this.firstElement == null) {
			this.firstElement = item;
			this.lastAddedElement = item;
		} else {
			this.lastAddedElement.setNext(item);
			this.lastAddedElement = item;
		}
		this.size++;
	}

	public DataType get(int index) {
		if (this.firstElement == null) {
			return null; //check if any element was added, if not return null
		} else {

			ArrayListElement<DataType> current = this.firstElement;
			int i = 0;
			do {
				if (i == index) {
					return current.getData();
				} else {
					i++;
					current = current.getNext();
				}
			} while (current != null);
			return null;
		}
	}


	public int getSize() {
		return this.size;
	}
}
