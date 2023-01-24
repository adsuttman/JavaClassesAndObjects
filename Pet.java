
public class Pet {
	//Variables
	private String name;
	private int age;
	private String location;
	private String type;
	
	//Constructors
	Pet() {
		
	}
	Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
}
