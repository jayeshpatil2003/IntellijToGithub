import java.util.Scanner;

public class string {
    public static void main (String [] args){
        Scanner sc = new Scanner(System .in);
    // .length
        System.out.println(" Enter you fullName");
        String fullName = sc.nextLine();
        System.out.println(fullName.length());

        //.charAt

       // for (int i =0 ; i<fullName.length();i++){
         //   System.out.println(fullName.charAt(i));
        //}

     //   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;");

       String name = "jayesh";
       System.out.println(name.charAt(0));
    }
}
