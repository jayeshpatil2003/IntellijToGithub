import java.util.Scanner;

public class Array {
    public static void main(String args[] ){
      /*  int [] marks = new int[4];
        marks[0] =97;
        marks[1]=65;
        marks[2]=54;
        marks[3]=67;

 */
      /*  Scanner sc =new Scanner(System.in);
        int marks = sc.nextInt();
        int markss [] = new int[4];
        for(int i= 0; i<4;i++){
            System.out.println(markss[i]);


       */

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        //Array declear
        int number []= new int[size];

        //input
        for (int i =0 ; i<size; i++){
            number[i]=sc.nextInt();
           // System.out.println(number[i]);
        }
        System.out.println("answer is :");
        //output
        for(int j =0 ;j<size;j++){
            System.out.println(number[j]);
}
    }
}
