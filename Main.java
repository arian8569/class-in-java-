import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int g , k , l , gh , gk ;

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        g = Se.s(a , b);
        k = Se.n(a , b);
        l = Se.m(a , b);
        gh = Se.q(a , b);
        gk = Se.r(a , b);

        System.out.print(g + " " + k + " " + l + " " + gh + " " + gk);

    }
}
