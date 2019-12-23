/*
Make a class that creates objects. 
Objects have to be read from file.
Objects have to be written to file.
*/

public class ObjectFile {
	public static void main(String[] args){

		System.out.println("Welcome to my Object Creater in java");
		System.out.println("This program will read and write objects to and from a file");

	}
}

class Car{

	private int id;
	private String company;
	private String model;
	private int year;

	public Car(int id, String company, String model, int year){
		this.id = id;
		this.company = company;
		this.model = model;
		this.year = year;
	}

}