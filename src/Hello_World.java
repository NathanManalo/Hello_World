import java.util.Scanner;

public class Hello_World {
    // classes should start with big first letter ex. Scanner
    // variables should start with small first letter ex. num1 or numOne
    // methods should start with small first letter then big first letter on the next word ex. nextInt() or nextLine()
    static int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(add(a,b));
    }
}
