package abstractionhw;

interface CellInterface {
	void Texting ();
}

abstract class Cell {
	public void Iphone () {
		System.out.println("iOS interface");
	}
	
	public abstract void Texting ();
	
	
}

class Android implements CellInterface {
	public void Texting () {
		System.out.println ("allows for texting");
	}
}




public class Interface2 {

}
