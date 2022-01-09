package polymorphismhw;

public class Television {
		public void brightness () {
		System.out.println("control brightness through contrast control"); 
		}
}

		class Sony extends Television {
			public void brightness() {
				System.out.println("control brightness through main menu");
			}
		class Samsung extends Television {
			public void brightness() {
				System.out.println("control brightness LCD control");
		}
		}
		
		public static void main(String[] args) {
			Sony s = new Sony();
			s.brightness();
		}
		}		


		

		


		
		
	

			
	


		

