package by.academy.lesson2;

public class Cat2 {

	public static void main(String[] args) {
		Cat cat2 = new Cat (); 
		Cat Серый = new Cat ();
        cat2.age = 1;
        System.out.println(cat2);
        cat2.grow();
        System.out.println(cat2);
        cat2.grow();
        System.out.println(cat2);
        cat2.grow();
        System.out.println("Кот ест");
        Серый.eat();
        System.out.println("Кот спит");
        Серый.sleep();
        System.out.println("Кот гуляет");
        Серый.walk();
        
        
        
	}

}
