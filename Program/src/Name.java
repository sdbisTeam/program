
import java.util.Scanner;

public class Name {
	//Balineanu Claudia
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {
		super();
		this.name = name;
	}

	public Name() {
		super();
	}
	
	public String console(String str) {
		
		
		System.out.println("What is your name?");
		Scanner name = new Scanner(System.in);
		str = name.nextLine();
        System.out.println("My name is: " + str);
     return str;
	}
	
	
}
