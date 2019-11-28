import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pls. enter your score: ");
        int score = scan.nextInt();
        
        if (score == 100) {
            System.out.println("You got a reward: BMW car.");
        } else if (score > 80 && score <= 99) {
            System.out.println("You got a reward: iPhone 11 Pro Max.");
        } else if (score >= 60 && score <= 80) {
            System.out.println("You got a reward: iPad Air.");
        } else {
            System.out.println("You got nothing.");
        }
    }
}