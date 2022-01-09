package homework2.inheritance;

public class Test {

	public static void main(String[] args) {
		
				//SalesRep to Traine is a single homework2.inheritancehw.inheritance
				// Manager, SalesRep to Trainee is a multi-level homework2.inheritancehw.inheritance
				//Sales Rep is a SUPER CLASS to Trainee class
				//Grandfather class is the SUPER CLASS to father's class
				
		
		Trainee elisha = new Trainee ();
		
		elisha.trainingweels ();
		elisha.fieldangent();
		elisha.mutant();
		
		
		SalesRep emma = new SalesRep ();
		
		emma.alchemist();
		emma.bachelors();
		emma.senority();
		
		
		Manager grace = new Manager ();
		
		grace.mutant();
		grace.senority();
		grace.alchemist();
		
		Witcher digory = new Witcher ();
		digory.mutant();
		digory.alchemist();
		
		Mage penny = new Mage ();
				
		penny.educator();
		penny.mutant();

	}

}
