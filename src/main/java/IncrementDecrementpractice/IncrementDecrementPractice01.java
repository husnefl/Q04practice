package IncrementDecrementpractice;

public class IncrementDecrementPractice01 {
    public static void main(String[] args) {  // x++= ; x=x+1;   x+=1 bunlarin ucude 1 artir anlamina gelemktedir
                                             // x--;    x=x-1;    x-=1 bunlarda 1'er azalt anlamindadir

        //question 1 :
        int x=10; //            cikti(OUTPUT)  // x'in degeri
        System.out.println(x++); //x=10          x=11
        System.out.println(++x); //x=12          x=12
        System.out.println(x--);//x=12           x=11
        System.out.println(--x); //x=10
        // note:yukaridaki islem outputu olustururken x'in degeri yazan kismina bakiyoruz hemen bir ustune bakmiyoruz
        // mesela ilk siralamada x++= 10'dur  x ilk olarak x i goruyor onun degeri 10 ciktiya 10 yaziyoruz sonra x'in degeri de 1 artoyor heemn x=11 diyoruz .
        //++x'i bulmak icin de x=11 degeri ile islem yapiyoruz.
//-------------------------------------------------------------------

       // question 2:
       int k = 10;

       int y=++k;     //y=11 ,   k=11
        int a=--k;    //a=10,    k=10
       int c= k--;   //c=10,     k=9

       System.out.println(a+c+k+y);//
//---------------------------------------------------------------
        //question 3: Print final value of num1, num2, num3, num4

        int num1 = 10;
        int num2 = num1 + 1;  // num2=10+1=11,  num=10

         num2 += 5;    //num2 =11+5=16,
        int num3 =  num2++;  // num3=16 ,num2=17
        int num4 = ++num1;  // num4= 1+10=11   num1=11
        System.out.println(num1);//11
        System.out.println(num2);//17
        System.out.println(num3);//
        System.out.println(num4);//11,17,17,12
//------------------------------------------------------------------------

        //Question 4:/ Print final value of a, b in the console
        int m = 15;
        int b = ++m;//b=16, m=16


         b = --m;   // b=15,   m=15
         b = ++m;   // b=16     m=16
         b = m--;   //b=16      m=15


        System.out.println("m:" + m + ", b:" + b );
//-----------------------------------------------------------------
        //Question 4- Print final value of a, b, c, d in the console
        int j = 5;
        int h = 2;
        int g;
        int d;
        g = ++h; //g=3 h=3
        d = j++;//d=5 j=6
        g++;//g=4
        System.out.println("j: "+j+"\nh: " + h + "\ng: " + g + "\nd: " + d); //6,3,4,5
      //NOTE:\n ile alt satır başına geçilir, \t ise tab tuşudur.

//-------------------------------------------------------------
     ////Question 5- What is the output?

        int num6=9;
        int num7=num6++; //num7=9   num6=10

        if(num7<10)    {         //  num7=9<10 -->true
           System.out.println(num7 + " Hello World");
        } else {
            System.out.println(num6 + "Hello Universal");
        }
//-----------------------------------------------------------------
     //Question-6 : What is the final result of s, r, p, v?


        int s = 5;
        int r = 2;
        int p;
        int v;

        p = ++r;     //p=3   ,   r=4
        v = s++;    //v=5    , s=6
        p++;        //p=4
        r = --s;     //r=5    s=4
        s = --p;    //s=3     p=3
        v = r--;    //v=5 ,   r=4

        System.out.println(s);//3
        System.out.println(r);//4
        System.out.println(p);//3
        System.out.println(v);//5
//-----------------------------------

      //Question 7, What is the sum of a+b+c+d?

       int z = 5;
        int i = 2;
        int l;
        int u;
        l = ++i; // l=3 ,i=3
        u = z++; //u=5 , z=6
        l++;  //l=4
        u = i--; // u=3,  i=2
        i= z++; //i=6, z= 7
        l = --i+ (--z);//   l=5+6=11  i=5 z=6

        System.out.println(z+i+l+u);//6+5+11+3=25
 //--------------------------------------------------------------

//Question 8- What is the result of num8+num2+num3+num4?


        int num8 = 10;
        int num9 = num8 + 1;   //num9=11, num8=10

        num9 += 5;   //num9=11+5=16,
        int num10 =  num9++; // num10=16, num9=17
       int num11 = ++num8; // num11=11    ,num8=11

        System.out.println(num8+num9+num10+num11);// 11+17+16+11=55
//-------------------------------------------------------------------------
     //Question 9- What is the result?

         int t =5 ;
         System.out.println( t>2 ? t<4 ? 10 : 8 : 7  );// t=5>2 oldugu icin 7 cikariyoruz ,ve sonra t>4  uyuk mu ona bakiyoruz
                                                      // 5>4 'ten yanlis oldugu icin 8 i aliyoruz yani sonuc 8 dir. t<4? 10: 8 e bakiyoruz.
                                                      // ? ise anlamindadir

//---------------------------------------------------------------------

////Question 10- What is the result?
        int fl =5 ;

        System.out.println(fl>2 ? fl <9 ? fl <6 ? fl >10 ? 10 : -2 :  8 : 7  : 20);
   //-2 'e kadar butun veriler dogru oldugu icin iki nokts onundeki sayilari atiyoruz en son fl>10 yani 5>10 yanlis oldugu icin -2 i aliyoruz.

//-------------------------------------------













    }
}
