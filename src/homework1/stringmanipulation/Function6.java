package homework1.stringmanipulation;

public class Function6 {

	public static void main(String[] args) {
		String input = "Hello There";
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		input1 = input1.reverse();
		System.out.println("The reverse string is:" + input1);
		}

}
