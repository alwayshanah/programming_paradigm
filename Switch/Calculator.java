import java.util.Scanner; // simple calculator using while loop

	private static Scanner scanner;
	   public void Constructor() {
      
		while (true) 
		{
			scanner = new Scanner(System.in); 
			System.out.println("\nSelect Operation"); 
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division\n");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt(); 

			if (choice >= 1 && choice <= 4) {
				System.out.println("Enter the first number:");
				double num1 = scanner.nextInt(); 
				System.out.println("Enter the second number:");
				double num2 = scanner.nextInt();
				double output = 0; 
            
         switch (choice) { 				
            case 1:
					output = num1 + num2;
					break;
				case 2:
					output = num1 - num2;
					break;
				case 3:
					output = num1 * num2;
					break;
				case 4:
					output = num1 / num2;
					break; 
				}
               System.out.println("Answer is: " + output); }
               
          else {
                
					System.out.println("You have entered wrong choice."); 
				}
			}
		}
			public static void main(String[] args) {
			    Calculator chuchu = new Calculator(); 
			    chuchu.Constructor();
	}
}