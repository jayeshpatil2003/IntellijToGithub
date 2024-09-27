public class pattern {
    public static void main (String[] args){

        int n = 4;
        int m =5;
        for(int i = 0;i<=n;i++){
         for ( int j=1;j<=m; j++) {

             System.out.print("*");
         }
            System.out.println( " ");
        }

        System.out.println("..................................................");
        System.out.println("...................................................");
      //outer loop
        for(int i = 1; i<=n ; i++){
           // inner  loop
            for(int j =1; j<=m; j++){

                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print( " ");
                }

            }
            System.out.println( );
        }


        int o = 4;


        System.out.println(".........................................................." );
        System.out.println(".........................................................." );



        for( int i = 1; i <=4; i++){
            for (int j=1 ;j<=i;j++ ){

                System.out.print("*");
            }
            System.out.println(" ");
        }

       System.out.println(".........................................................");
        System.out.println(".........................................................");

        int h = 4;

        for (int i = h; i>=1; i--){
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
        /*
               *
             * *
           * * *
         * * * *
     */
        System.out.println("::::::::::::::::::::::::::::::::::");
        int r = 4 ;
         for(int i = 1; i<=r ;i++){

             for(int j = 1; j<=r-i;j++){
                 System.out.print( " " );
             }
             for( int j= 1; j <=i ; j++){

                 System.out.print("*");
             }
             System.out.println(" ");
         }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
       int k = 5 ;

         for(int i = 1; i<=k ; i++){

             for(int j = 1; j<=i; j++){
                 System.out.print(j+"   ");
             }
             System.out.println(" ");
         }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::");

         int p = 5;

        for (int i = p; i>=1; i--){
            for ( int j = 1; j<=p ; j++){
                System.out.print(p+" ");
            }
            System.out.println("  ");
        }
    }
}
