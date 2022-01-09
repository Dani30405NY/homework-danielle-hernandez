package polymorphismhw;


class Akita {
	public void loyal () {
		System.out.println("will always come back home");
		}
	}
	
class Frenchie extends Akita {
	public void loyal () {
		System.out.println("will always snore");
		}
	}

class Hound extends Akita {
	public void loyal () {
		System.out.println("be curious");
}
		}


public class Dog {
	
public static void main(String[] args) {
		Akita a = new Akita ();
		a.loyal();
		}

}
