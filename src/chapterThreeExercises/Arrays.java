package chapterThreeExercises;

import java.util.Scanner;

 class Array{
    public static void main(String[] args) {


        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
//taking column as input
        n = sc.nextInt();
        // Declaring the two-dimensional matrix

        int array[][] = new int[m][n];

// Read the matrix values

        System.out.println("Enter the elements of the array: ");

//loop for row

//accessing array elements
        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
//prints the array elements
                System.out.print(array[i][j] + " ");
//throws the cursor to the next line
            System.out.println();
        }


    }
}
