public class BreakLabel {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        LABEL1: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    break LABEL1;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        LABEL2: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    continue LABEL2;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}