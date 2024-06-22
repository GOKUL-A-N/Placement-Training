import java.util.Scanner;
//Width and precision concept

public class WidhtAndPrecision {
    public static void main(String[] args) {
        widthandprecision();
        assignmentOne();
    }

    static void widthandprecision() {
        float num = 1234.5678f;
        System.out.printf("%15.2f \n", num);
        System.out.println(" \"Helloworld\"");
        System.out.println("%%");
        System.out.printf("%%%%"); // odd numbers of % produces error
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        System.out.printf("%" + width + "d", 10); // adding variable width to printf statement
        float widthF = in.nextFloat();
        System.out.printf("%" + widthF + "f", 10.04); // adding variable width to
        in.close();
    }

    static void assignmentOne() {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int precision = sc.nextInt();
        System.out.printf("%" + width + "." + precision + "f", 10.04);
        sc.close();
    }

}