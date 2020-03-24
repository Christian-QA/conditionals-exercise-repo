package conditionals.trial.exerc3;

	public class Conditionals {
		
		public int addOrMultiply(int num1, int num2, boolean booleanVariant) {
			
			if (num1 % 2 == 0 || num2 % 2 == 0 ) {
				System.out.println("One of these guys is even");				
			} else {
				System.out.println("Both odd");			
			}
			
			if (booleanVariant) {
				return num1 + num2;
			} else {
				return num1 * num2;
			}
						
		}
		
	}