public class ifClass {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 5; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {


                System.out.print("*");


            }
            System.out.println();

        }
        System.out.println();


        {

            System.out.println();


            int rows = 4;

            for (int j = 1; j <= rows; j++) {
                for (int i = 1; i <= rows - j; i++) {
                    System.out.print("  ");
                }

                for (int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
                System.out.println();


            }

            System.out.println();


            for (int j = 1; j <= 4; j++) {
                for (int i = 1; i <= 4 - j; i++) {
                    System.out.print("  ");
                }

                for (int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
                System.out.println();

                        int rowsNumber = 5;

                        for (int i = rowsNumber; i >= 1; --i) {
                            for (int jco = 1; jco <= i; ++j) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                }
            }

        }

    }

}






