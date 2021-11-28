import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {



        int a;
        int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        while(a!=0)
        {
            b=b*10+a%10;
            a=a/10;
        }

        System.out.println("hetveradarcvox number = "+b);
      /*  int a=456;
        int b;
        int c;
        int d;
        b=a%10;
        System.out.print(b);
c=a/10%10;
        System.out.print(c);
        d=a/100;
        System.out.print(d);*/
    }

}

