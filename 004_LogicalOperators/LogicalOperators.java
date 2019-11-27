public class LogicalOperators {
    public static void main(String[] args) {
        // & <-- verifies both operands
        // && <-- stops evaluating if the first operand evaluates to false since the result will be false

        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("I'm in Beijing.");
        } else {
            System.out.println("I'm in Nanjing.");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("I'm in Beijing.");
        } else {
            System.out.println("I'm in Nanjing.");
        }
        System.out.println("num2 = " + num2);
    }
}