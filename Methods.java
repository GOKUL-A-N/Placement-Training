public class Methods {
    public static void main(String[] args) {
        consecutivePrimeSum(100);
    }

    static void consecutivePrimeSum(int range) {
        int sum = 2;
        int count = 0;
        int val = 3;
        while (sum <= range) {
            if(isPrime(val)) {
            sum = sum + val;
            if (isPrime(sum))
                count++;
            }
            val++;
        }
        System.out.println(count);
    }
    // efficient method to check prime number or not
    static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2)
            return false;
        if (num == 2 || num == 3 ) {
            return true;
        }
        if(num%6!=5 && num%6!=1)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}