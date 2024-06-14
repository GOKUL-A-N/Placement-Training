

public class DigitManipulation {

    // finding even numbers from a given number
    public static void main(String[] args) {
        // Construcion (right construction , left construction)
        // extraction (right extraction , left extraction)
        // Note reverse a given number can be done using this method
        // int val = 45672;
        // int pv = 1;
        // while (val / pv != 0) {
        // pv *= 10;
        // }
        // while (pv != 1) {
        // pv /= 10;
        // int res = (val / pv) % 10;
        // if (res % 2 == 0) {
        // System.out.println(res);
        // }
        // }
        // Segregation(68314);
        // digitSwap(514536);
        // harshadNumber(12);
        // strongNumber(145);
        armstrong(143);
    }

    // segregation of odd and even numbers from a given number
    static void Segregation(int num) {
        int even = 0, odd = 0, opv = 1;
        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even = (even * 10) + rem;
                // epv *= 10;
            } else {
                odd = (odd * 10) + rem;
                opv *= 10;
            }
            num /= 10;
        }
        System.out.println(even * opv + odd);
    }

    // alternate digit swap
    static void digitSwap(int num) {
        int count = 0, pv = 1, safe = 0,res = 0;
        while (num / pv != 0) {
            count++;
            pv = pv * 10;
        }
        if (count % 2 != 0) {
            safe = num % 10;
            num = num / 10;
        }
        pv = 1;
        while(num != 0){
            int pair = num % 100;
            int swap = (pair % 10) * 10 + pair / 10;
            res = swap * pv + res;
            pv = pv * 100;
            num = num /100;
        }
        if(safe != 0 ) System.out.println(res * 10 + safe);
        else System.out.println(res);
    }

    static int sumOfDigits(int num){
        int res = 0;
        while(num != 0) {
            res = res + num % 10;
            num = num / 10;
        }
        return res;
    }
    // harshad number problem
    static void harshadNumber(int num){
        if(num % sumOfDigits(num) == 0) System.out.println("Harshad number");
        else System.out.println("Not a Harshad Number");
    }

    static int factorial(int num){
        if(num <= 0) return 0;
        if(num == 1) return 1;
        return num * factorial(num-1);
    }
    // strong number problem
    static void strongNumber(int num){
        int res  = 0;
        int safe = num;
        while(num != 0) {
            res += factorial(num % 10);
            num = num / 10;
        }
        if(res == safe) System.out.println("Strong number");
        else System.out.println("Not a strong number");
    }

    //armstrong Number or not
    static void armstrong(int num){
        int safe = num;
        int count = 0;
        int res = 0;
        while(num != 0){
            count++;
            num = num/10;
        }
        num = safe;
        while(num != 0){
            res += (int)Math.pow(num%10, count);
            num /= 10;
        }
        if(res == safe) System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number");
    }
}
// 6829

// for extraction formula : (digit / pv) % 10