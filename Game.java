
public class Game {
	//Variables
	private String title;
	private String genre;
	private double price;
	
	
	//Constructors
	Game() {
		title = "untitled";
		price = 0.00;
		
	}
	
	Game(String title, String genre, double price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
	
	Game(String title, String genre) {
		this.title = title;
		this.genre = genre;
		this.price = 59.99;
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public double getPrice() {
		return price;
	}
	
	//Setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//methods
	public boolean isCheap() {
		return (price <= 20.00);
	}
	public String description() {
		return title + " is a " + genre + " game that costs $" + ".";
	}
	
}
