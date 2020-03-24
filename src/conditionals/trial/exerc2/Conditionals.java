package conditionals.trial.exerc2;

	public class Conditionals {
		
		public String flowchartStartNum(int num) {
			
			if (num > 2000) {
				System.out.println("A");
				
				if (num > 6000) {
					
					System.out.println("C");
					
				} else {
					
					System.out.println("B");
								
				}
					
			} else {
				
				System.out.println("1");
				
				if (num > 100) {
					
					System.out.println("3");
					
					if (num > 600) {
						
						System.out.println("5");
						
					} else {
						
						System.out.println("4");
						
						if (num > 500) {
							
							System.out.println("6");
							
						} else {
							
							System.out.println("7");
							
						}
						
					}
					
				} else {
					
					System.out.println("2");
					
				}
				
			}
			
			return "---------------END-----------------";
		}
		
	}