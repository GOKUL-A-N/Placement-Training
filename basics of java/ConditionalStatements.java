import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional statements types
        // simple if
        // if else
        // if else ladder
        // cascaded if else
        // nested if else
        // switch
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if both condition is true
        fooBar(n);
        int year = sc.nextInt();
        leapYear(year);
        sc.close();
        System.out.println(leapYear(2024));
        noOfDaysRemaining(1, 1, 2024);
    }

    static void fooBar(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FooBar");
        } else if (n % 5 == 0) {// if only divisible by 5
            System.out.println("Bar");
        } else {// if only divisible by 3
            System.out.println("Foo");
        }
    }

    static boolean leapYear(int year) {
        // example of nested if
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; //
                } else {
                    return false; //
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
        // short cut method for leap year program
        // if(year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0)) {
        // System.out.println("Leap Year");
        // } else {
        // System.out.println("Not Leap Year");
        // }
    }

    // can be used only in c
    // switch statement to set ranges
    // static void switchStatement(int num){
    // switch (num) {
    // case 0 ... 9:
    // System.out.println("Ones");
    // break;
    // case 10 ... 99:
    // System.out.println("tens");
    // break;
    // case 100 ... 999:
    // System.out.println("Hundreds");
    // break;
    // default:
    // break;
    // }
    // }

    static void noOfDaysRemaining(int date, int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days += 31;
            case 2:
                days += (leapYear(year)) ? 29 : 28;
            case 3:
                days += 31;
            case 4:
                days += 30;
            case 5:
                days += 31;
            case 6:
                days += 30;
            case 7:
                days += 31;
            case 8:
                days += 31;
            case 9:
                days += 30;
            case 10:
                days += 31;
            case 11:
                days += 30;
            case 12:
                days += 31;
        }
        days -= date;
        System.out.println(days);
    }
}
