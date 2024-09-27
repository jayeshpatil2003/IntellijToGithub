import java .util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" sagar Problem");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your first value");
        //int a = sc.nextInt();

        //System.out.println("Enter you second value");
        //int b = sc.nextInt();

        //int c = (a * a) + (b * b);

        //int k = c;
        //System.out.println("your Answer is :" + c);

        int c = sc.nextInt();


        for (int a=1;a<=c;a++) {

            if (c>a) {
                System.out.println("it is true");

            } else {
                System.out.println("it is false");
            }


        }
    }
}