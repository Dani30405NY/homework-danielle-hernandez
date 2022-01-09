package tempconverter;
import java.util.*;
public class TempConverter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Welcome");
		System.out.println("---Celsius-Fahrenheit/Fahrenheit-Celsius Converter---");
		System.out.println("Choose the conversion mode:\n1. Celcius-Fahrenheit\n2. Fahrenheit-Celcius");
		int choice = sc.nextInt();
		System.out.println("/n Enter the temperature to convert: ");
		if (choice==1) {
			double c = sc.nextDouble();
			double f = (c*9/5)+32;
			System.out.println(c + "C -> " + f + "F");
		}
		else if(choice==2) {
			double f = sc.nextDouble();
			double c = (f-32)*5/9;
			System.out.println(f + "F -> " + c + "C");
		}
		
		System.out.println("Do you want to convert other temperatures? Y/N");
		char s = sc.next().charAt(0);
		if(s=='N') break;
		}
		System.out.println("Goodbye! Until next time!");  
		}
		
	}

