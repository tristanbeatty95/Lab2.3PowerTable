import java.util.Scanner;

public class PowerTables {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Please enter a number");
			int num = scan.nextInt();
			
			int i;

			for (i = 1; i <= num; i++) {
				System.out.println(i + "     " + (i * i) + "     " + (i * i * i));

			}
			System.out.println("Number Squared Cubed");
			
			System.out.println("Would you like to continue? y/n ?");
			String cont2 = scan.next();
			
			if (cont2.equals("n")) {
				cont = false;
			}
		} while (cont == true);
	
	}
}
