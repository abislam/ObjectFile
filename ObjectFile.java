/*
Make a class that creates objects. 
Objects have to be read from file.
Objects have to be written to file.
*/

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectFile{
	public static void main(String[] args){

		//object array
		Car sedan[] = new Car[100];

		System.out.println("Welcome to my Object Creater in java");
		System.out.println("This program will read and write objects to and from a file");

		sedan[0] = new Car(0, "Mercedez", "S Class", 2020);
		sedan[1] = new Car(1, "Mercedez", "S Class", 2019);
		sedan[2] = new Car(2, "Mercedez", "S Class", 2018);
		sedan[3] = new Car(3, "Mercedez", "S Class", 2017);


		System.out.println(sedan[0].getID() + "\t" + sedan[0].getCompany() + "\t" + sedan[0].getModel() + "\t" + sedan[0].getYear());
		System.out.println(sedan[1].getID() + "\t" + sedan[1].getCompany() + "\t" + sedan[1].getModel() + "\t" + sedan[1].getYear());
		System.out.println(sedan[2].getID() + "\t" + sedan[2].getCompany() + "\t" + sedan[2].getModel() + "\t" + sedan[2].getYear());
		System.out.println(sedan[3].getID() + "\t" + sedan[3].getCompany() + "\t" + sedan[3].getModel() + "\t" + sedan[3].getYear());

		//write object to file
		//https://examples.javacodegeeks.com/core-java/io/fileoutputstream/how-to-write-an-object-to-file-in-java/

		sedan[4] = new Car(4, "Mercedez", "S CLASS", 2016);
		sedan[4].WriteObjectToFile(sedan[4]);

	}

	public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream("object.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Car implements Serializable{

	//default serialVersion id
    private static final long serialVersionUID = 1L;

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

	//getters
	public int getID(){
		return id;
	}

	public String getCompany(){
		return company;
	}

	public String getModel(){
		return model;
	}

	public int getYear(){
		return year;
	}

	//setters
	public void setID(int id){
		this.id = id;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public void setModel(String model){
		this.model = model;
	}

	public void setYear(int year){
		this.year = year;
	}

}
































