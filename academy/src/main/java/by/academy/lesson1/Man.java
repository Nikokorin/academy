package by.academy.lesson1;

public class Man {
  int age = 1;
  double weight = 2;
  double height = 5;
    
	public void grow() {
     age = age + 1;
		weight = weight + 1;	
  }
 
  @Override
  public String toString() {
	  return "age: " + age + ", weight: " + weight + ", height: " + height;
	  }
}
