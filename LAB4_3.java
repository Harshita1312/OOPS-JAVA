/* 3.Aim of the program : Write a program in Java having three classes Apple, Banana and Cherry.
Class Banana and Cherry are inherited from class Apple and each class have their own member function show() .
Using Dynamic Method Dispatch concept display all the show() method of each class.
Input:  Mention show function of each class.
Output: Display show function of each class accordingly. */

class apple
{
	void show(){
	    System.out.println("i am a apple"); }
}
class banana extends apple
{
	void show(){
	    System.out.println("i am a banana"); }
}
class cherry extends apple
{
	void show(){
	    System.out.println("i am a cherry"); }
}

public class LAB4_3
{
	public static void main(String args[])
	{
		apple obj = new banana();
		apple obj1 = new cherry();
		obj.show();
		obj1.show();
	}
}
/*
public class LAB4_3 {

    public static void main(String[] args) {
        // Create objects of each class
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Display show() methods using dynamic method dispatch
        apple.show();
        banana.show();
        cherry.show();
    }
}

class Apple {
    public void show() {
        System.out.println("I am an Apple.");
    }
}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("I am a Banana.");
    }
}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("I am a Cherry.");
    }
}
*/