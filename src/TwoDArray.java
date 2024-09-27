import java.util.Scanner;

public class TwoDArray {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row index");
        int rows = sc.nextInt();

        System.out.println("Enter col index");
        int cols = sc. nextInt();

        // declear Array

        int [][] number = new int[rows][cols];

        //input
        for(int i = 0; i < rows ;i++){
            for(int j =0; j<cols;j++){
                number[rows][cols]= sc.nextInt();
            }
        }
                // output
        for(int i =0 ; i <rows ; i++){
            for(int j =0 ; j<cols ;j++){
                System.out.print(number[rows][cols]);
            }
            System.out.println();
        }

    }
}
