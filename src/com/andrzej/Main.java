package com.andrzej;

import java.util.ArrayList;
import java.util.List;


//FREQUENT INTERVIEW TASKS FOR JUNIOR POSITIONS
public class Main {

	public static void main(String[] args) {


		ArrayMethods myArray = new ArrayMethods();

		myArray.addToArray("kotek");
		myArray.addToArray("ala");
		myArray.addToArray("jasiek");
		myArray.addToArray("coś");
		myArray.addToArray("tomek");
		myArray.addToArray("jacek");
		myArray.addToArray("krzyś");


		System.out.println(myArray.get(0));
		System.out.println(myArray.get(1));
		System.out.println(myArray.get(2));
		System.out.println(myArray.get(3));
		System.out.println(myArray.get(4));
		System.out.println(myArray.get(5));
		System.out.println(myArray.get(6));

		System.out.println(myArray.getSize());


		//IMPROVEMENT WITH GENERICS - to be done in home 

		ArrayMethods<ObElement> myArray2 = new ArrayMethods<ObElement>();






		//zróbcie prostego array lista
		//do którego wkładamy coś np. objekt
		//dodawać coś, wziąć element
		//ma podać rozmiar
		//wewnątrz ma działać lista jednokierunkowa


	}
}
