package abstractionhw;

abstract class Pinot {
	public void Red () {
		System.out.println("bold and dry");
	}
	
	public abstract void alcoholic ();
	
	
}

class Cabernet extends Pinot {
	
	public static Cabernet c;
	public static Cabernet x;

	public void alcoholic () {
		System.out.println ("contains 12% alcohol");
	
}

abstract class Merlot {
	
}

public class Wine {
	public static void main(String[] args) {
		Cabernet.x = new Cabernet ();
		x.Red();
		x.alcoholic();
		}

}


}
