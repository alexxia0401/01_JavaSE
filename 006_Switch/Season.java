import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Pls. enter a month: (1-12)");
		int month = scan.nextInt();

		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("Spring.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Autumn");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
				break;
			default:
				System.out.println("You entered a wrong month.");
		}
	}
}