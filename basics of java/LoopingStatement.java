
public class LoopingStatement {
    public static void main(String[] args) {
        // while loop -> entry loop 
        // for loop -> entry loop
        // do while loop -> exit loop
        // productPrimeFactor(100);
        // perfectSquare(24);
        // amicable(220,284);
        // betrothed(75, 48);
        // System.out.println(powerOfTwo(32));
        // fibonacci(5);
        prime(25);
    }   


    // Given a number represent the number in terms of its prime factors
    static void productPrimeFactor(int num){
        // ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        int i=2;
        while(num != 1 ){

            if(num % i == 0){
                System.out.println(i + " ");
                num = num / i;
            } 
            else i++;
        }
        
    }

    // find the minimun number to be divided to make a number perfect square
    // has some errors to be solved
    static void perfectSquare(int num){
        int i=2;
        int count = 0;
        int res = 1;
        while(num != 1 ){

            while(num % i == 0){
                count++;
                num = num / i;
            } 
            if(count %2 != 0) res *= i;
            i++;
        }
        System.out.println(res);
    }

    // amicable pair or not
    // condition1: sum of factors of first number = second number
    // condition2: sum of factors of second number = first number


    // to get the sum of factors
    static int sumOfFactors(int num){
        int res = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0) res += i;
        }
        return res;
    }
    // to perform the amicable pair
    static void amicable(int num1, int num2){
        System.out.println((sumOfFactors(num1) == num2) && (sumOfFactors(num2)==num1));
    }


    // to perform betrothed pairs
    static void betrothed(int num1, int num2){
        System.out.println((sumOfFactors(num1)-1 == num2) && (sumOfFactors(num2)-1 ==num1));
    }

    // check power of two
    static boolean powerOfTwo(int num){
        while(num != 1){
            if(num % 2 == 0) num = num / 2;
            else return false;
        }
        return true;
    }

    static void fibonacci(int num){
        int num1 = 1;
        int num2 = 1;
        System.out.println(num1 );
        System.out.println(num2);
        for(int i = 2; i < num;i++){
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }


    // prime number or not
    static void prime(int num){
        if(num % 2 != 0 || num == 2 || num == 3 || num % 6 ==1 || num % 6 == 5){
        int fact , range;
        range = (int)Math.sqrt(num);
        for(fact = 3; fact <= range; fact+=2){
            if(num % fact == 0){
                break;
            }
        }
        if(fact > range){
            System.out.print("prime");
        }else System.out.println("Not prime");
    }
    }

    // algorithms for  finding prime numbers
    // sieve of eratosthenes (method using array to set all not prime numbers to falsee by iterating the index and setting it to false)
    // sieve of sundaram
    // sieve of atkin

}



