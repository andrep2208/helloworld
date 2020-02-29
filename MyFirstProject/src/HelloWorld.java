import java.util.Scanner;

public class HelloWorld{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your first name");
		String firstName = scanner.next();
		
		System.out.println("What is your last name");
		String lastName = scanner.next();
		
		System.out.println("Hold old are you ?");
		int age = scanner.nextInt();
		
		
		System.out.println("Hello " + firstName + " " + lastName + "\nYou are " + age + " years old");
		
		
	}

	


}


