package Java_Training;

public class Day1_Day2 {
    public static void main (String[] args) {
        int a = 10 ;
        int b = 3 ;
        double d = 10/4;
        float price = 99.99f;

        int x = 5;
        int y = x++;

        int c = 10;

        int score = 80;
        int mark =  25;


        System.out.println(a/b);
        System.out.println(a%b); // 1
        System.out.println(d); // 2
        System.out.println(price) ; // 99.99f
        System.out.println(y) ; // 5
        System.out.println(x++); // 6

        int z = --x;
        System.out.println(z); //  6
        System.out.println(--x); // 5 , ( the values of x,y,z = 5)

        System.out.println(c++ + ++c)  ; // 10 + 11 = 22

        System.out.println(score >= 80 ? "Pass" : "Fail") ;
        System.out.println( mark<= 20 ? "Pass" : "Fail") ;
    }


}
