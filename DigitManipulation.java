
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
        // armstrong(143);
        // adam(10);
        // magic(1729);
        // baseConversion(11001, 10);
        // gcd(12, 24);
        // lcm(36, 24);
        // minCombPseudoBinary(55);
        // validanagram(987654321, 9874561230);
        // panNumber(246, 789);
        // endStar(5);
        // pyramidStar(5);
        endAboveStar(5);
    }
    // 6829

    // for extraction formula : (digit / pv) % 10
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
        int count = 0, pv = 1, safe = 0, res = 0;
        while (num / pv != 0) {
            count++;
            pv = pv * 10;
        }
        if (count % 2 != 0) {
            safe = num % 10;
            num = num / 10;
        }
        pv = 1;
        while (num != 0) {
            int pair = num % 100;
            int swap = (pair % 10) * 10 + pair / 10;
            res = swap * pv + res;
            pv = pv * 100;
            num = num / 100;
        }
        if (safe != 0)
            System.out.println(res * 10 + safe);
        else
            System.out.println(res);
    }

    static int sumOfDigits(int num) {
        int res = 0;
        while (num != 0) {
            res = res + num % 10;
            num = num / 10;
        }
        return res;
    }

    // harshad number problem
    static void harshadNumber(int num) {
        if (num % sumOfDigits(num) == 0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad Number");
    }

    static int factorial(int num) {
        if (num <= 0)
            return 0;
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    // strong number problem
    static void strongNumber(int num) {
        int res = 0;
        int safe = num;
        while (num != 0) {
            res += factorial(num % 10);
            num = num / 10;
        }
        if (res == safe)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }

    // armstrong Number or not
    static void armstrong(int num) {
        int safe = num;
        int count = 0;
        int res = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        num = safe;
        while (num != 0) {
            res += (int) Math.pow(num % 10, count);
            num /= 10;
        }
        if (res == safe)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");
    }

    static int reversed(int num) {
        int res = 0;
        while (num != 0) {
            res = (res * 10) + (num % 10);
            num /= 10;
        }
        return res;
    }

    // adam number
    static void adam(int num) {
        int num1 = num;
        int num2 = reversed(num1);
        if (num1 * num1 == reversed(num2 * num2)) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }

    // magic number
    static void magic(int num) {
        int sum = sumOfDigits(num);
        int res = reversed(sum);
        if (sum * res == num)
            System.out.println("Magic Number");
        else
            System.out.println("Not a magic Number");
    }

    // base conversion
    static void baseConversion(int num, int base) {
        int res = 0, pv = 1;
        if (num > base) {
            while (num > 0) {
                res = (num % base) * pv + res;
                num /= base;
                pv = pv * (2);
            }
            System.out.println(res);
        }
    }

    // greatest common divisor
    static int gcd(int num1, int num2) {
        // method 1 ( Euclid's method)
        while (num2 > 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num1);
        return num1;
        // method 2
        // int val = Math.min(num1, num2);
        // while (val != 0) {
        // if (num2 % val == 0 && num1 % val == 0) {
        // System.out.println(val);
        // break;
        // } else {
        // val = val - 1;
        // }
        // }
        // if (val == 0)
        // System.out.println("No common factor");
    }

    // lcm
    static void lcm(int num1, int num2) {
        System.out.println((num1 * num2) / gcd(num1, num2));
    }

    // given an integer represent the number as a sum of minimum possible
    // combination only with pseudobinary numbers
    static void minCombPseudoBinary(int num) {
        while (num != 0) {
            int rem = 0;
            int pv = 1;
            while (num / pv != 0) {
                if ((num / pv) % 10 > 0)
                    rem = 1 * pv + rem;
                else
                    rem = 0 * pv + rem;
                pv *= 10;
            }
            num = num - rem;
            if (num != 0)
                System.out.print(rem + " + ");
            else
                System.out.print(rem);
        }
    }

    // valid anagram
    static void validanagram(long num1, long num2) {
        // method 1
        long res1 = 0, res2 = 0;
        while (num1 != 0) {
            long rem = num1 % 10;
            res1 += rem * 10 ^ rem;
            num1 /= 10;
        }
        while (num2 != 0) {
            long rem = num2 % 10;
            res2 += rem * 10 ^ rem;
            num2 /= 10;
        }
        if (res1 == res2)
            System.out.println("Yes");
        else
            System.out.println("No");
        // // method 2
        // int res[] = new int[10];
        // int flag = 0;
        // for(int pv = 1;num1/pv > 0 && num2/pv > 0;pv *= 10){
        // res[(num1/pv) % 10]++;
        // res[(num2/pv) % 10]--;
        // }
        // for(int num: res){
        // if(num != 0) {System.out.println("No"); flag=1;break;}
        // }
        // if(flag == 0) System.out.println("Yes");
    }

    static void panNumber(int num1, int num2) {
        int num3 = num1 + num2;
        int res = 0;
        while (num1 != 0 || num2 != 0 || num3 != 0) {
            if (num1 > 0)
                res += (num1 % 10) * 10 ^ (num1 % 10);
            if (num2 > 0)
                res += (num2 % 10) * 10 ^ (num2 % 10);
            if (num3 > 0)
                res += (num3 % 10) * 10 ^ (num3 % 10);
            if (num1 > 0)
                num1 /= 10;
            if (num2 > 0)
                num2 /= 10;
            if (num3 > 0)
                num3 /= 10;
        }
        int count = 0;
        int flag = 1;
        while (res != 0) {
            if (res % 10 != 0 || res % 10 != count) {
                flag = 0;
                System.out.println("False");
                break;
            }
            count++;
            res /= 10;
        }
        if (flag == 1) {
            System.out.println("True");
        }
    }
    static void endStar(int row){
        for(int i=1;i<=row;i++){
            for(int col = 1;col<=row;col++){
                if(col <= row-i){
                    System.out.print(" "+" ");
                }
                else System.out.print("*"+" ");
            }
            // for(int col = row-i+1;col<=row;col++){
                
            // }
            System.out.println();
        }
    }

    static void pyramidStar(int row){
        for(int i=1;i<=row;i++){
            for(int col = 1;col<=(row)-i;col++){
                System.out.print(" "+ "");
            }
            for(int j = 0;j<i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void endAboveStar(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j<i){
                    System.out.print(" "+" ");
                }
                else System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
