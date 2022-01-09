package encapsulationhw;

public class Main {

	public static void main(String[] args) {
		
		Doctors t = new Doctors();
		t.setName("Roberta");
		System.out.println();
		t.setAge(33);

		System.out.println(t.getName());
		System.out.println(t.getAge());
	}

}
