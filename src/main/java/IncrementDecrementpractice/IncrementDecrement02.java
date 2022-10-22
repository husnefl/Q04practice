package IncrementDecrementpractice;

public class IncrementDecrement02 {
    public static void main(String[] args) {
        //Question 11
/*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5

                */

        int row=5;            //row dedidi satir sayisidir j' de sutun sayisidir.
// boyle sorularda ilk for satir(row), ikinci for sutun(column)/dur
        for(int i=1; i<=row; i++) {

            for(int j=1; j<=row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

 // ---------------------------------------
     /*  Question 1

      *****
      *****
      *****
      *****
      *****

     */

        int n=5;            //row

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
     /*

      ****
      ****
      ****
      ****
      ****
     */

        int x=4;
           //row

        for(int i=1; i<=x; i++) {

            for(int e=1; e<=x; e++) {
                System.out.print( " * ");
            }
            System.out.println();
        }
///-------------------------------------------------
        /*
         * *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        int l=5;

        for(int i=1; i<=l;   i++) {

            for(int j=1;  j<=i;   j++) {

                System.out.print("j"+" ");
            }
            System.out.println();
//----------------------------------------------------
         /*
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

*/
            int m=5;
            for(int a=1; a<=m;  a++) {

                for(int j=1;  j<=a;  j++) { //a'nin 1.satiri icin 1 basacak 1
                                            //ikini satirda   j iki ye kadar gidip iki tane basacsk 1 2
                                            // bu islem 5 'e kadar gidecek cunku yukarida satir sayiis yani m= 5 verildi
                    System.out.print(j+" ");
                }
                System.out.println();

            }
        }






    }
    }





