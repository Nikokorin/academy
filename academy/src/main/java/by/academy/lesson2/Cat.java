package by.academy.lesson2;

public class Cat {
	int age;
	String Cattie;
	public void grow () {
		age = age+1;
	}
	public void sleep () {
		System.out.println("Кот спит");
	}
	
	public void eat () {
		System.out.println("Кот ест");
	}
	
	public void walk () {
	    System.out.println("Кот гуляет");
	}
	@Override
	  public String toString() {
		  return "age: " + age;
	
	}
}
