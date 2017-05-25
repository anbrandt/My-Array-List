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

		System.out.println(myArray.get(0));

		System.out.println(myArray.get(1));

		System.out.println(myArray.get(2));

		System.out.println(myArray.getSize());



		//zróbcie prostego array lista
		//do którego wkładamy coś np. objekt
		//dodawać coś, wziąć element
		//ma podać rozmiar
		//wewnątrz ma działać lista jednokierunkowa


	}
}
