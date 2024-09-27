import java.util.Scanner;

public class linearsearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int input = sc.nextInt();
      //ARRAY DECLEAR
      int linear []= new int[input];
      for(int i= 0; i<input ; i++){
         linear[i]=sc.nextInt();
      }
        System.out.println("find your index");
      int x = sc.nextInt();

      // output
        for(int i=0; i< linear.length;i++){
            if(linear[i]==x){
                System.out.println("x found at index :"+i);
            }
        }
    }
}
