/*
Make a class that creates objects. 
Objects have to be read from file.
Objects have to be written to file.
*/

public class ObjectFile {
	public static void main(String[] args){

		System.out.println("Welcome to my Object Creater in java");
		System.out.println("This program will read and write objects to and from a file");

		Car sedan = new Car(0, "Mercedes", "S Class", 2020);
		Car suv = new Car(1, "Dodge", "Durango", 2020);
		Car coup = new Car(2, "Lamborghini", "Gallardo", 2020);


		System.out.println(sedan.getID() + "\t" + sedan.getCompany() + "\t" + sedan.getModel() + "\t" + sedan.getYear());
		System.out.println(suv.getID() + "\t" + suv.getCompany() + "\t" + suv.getModel() + "\t" + suv.getYear());
		System.out.println(coup.getID() + "\t" + coup.getCompany() + "\t" + coup.getModel() + "\t" + coup.getYear());
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
































