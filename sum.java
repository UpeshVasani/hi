import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        System.out.print(" ");
        int a = value1.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.print("+");
        int b = value2.nextInt();

        System.out.println("-----");
        System.out.println(" " + a + b);
        System.out.println();

        System.out.println(" " + a);
        System.out.println("*" + b);
        System.out.println("-----");
        System.out.println(" " + a * b);
    }
}
