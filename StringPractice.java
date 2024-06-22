public class StringPractice {
    public static void main(String[] args) {
        // numberOfSpecialCharacters("zfjbn2@#dkfnb#$%");
        // convertLowerCaseToUpperCase("Hello, world!");
        // printOnlyNumbers("dbjn45n324");
        // eliminateVowel("alijbnefj");
        // int[] arr = {5,4,6,3,1};
        // nextLargestNumber(arr,5);
        // reverseParticularIndexValues(57843,4,1);
        // reverseIndexesfromarange(51437, 3);
        // nextlargest(arr,5);
        nextLargestWithNumber(54631);
    }

    static void numberOfSpecialCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                count++;
        }
        System.out.println(count);
    }

    static void convertLowerCaseToUpperCase(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                res += (char) (s.charAt(i) - 32);
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    static void printOnlyNumbers(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                res = (res * 10) + ((int) str.charAt(i) - 48);
        }
        System.out.println(res);
    }

    static void eliminateVowel(String s) {
        s = s.replaceAll("[aeiouAEIOU]`", "");
        System.out.println(s);
    }

    static void nextlargest(int[] arr, int size) {
        int newind = -1, temp, ind;
        for (ind = size - 2; ind >= 0; ind--) {
            if (arr[ind] < arr[ind + 1]) {
                newind = ind;
                break;
            }
        }
        if (ind == -1) {
            newind = 0;
            reverse(arr, size, newind);
        } else {
            for (ind = size - 1; ind > newind; ind--) {
                if (arr[newind] < arr[ind]) {
                    temp = arr[newind];
                    arr[newind] = arr[ind];
                    arr[ind] = temp;
                    break;
                }
            }
            reverse(arr, size, newind + 1);
        }
    }

    static void reverse(int[] arr, int size, int newind) {
        int front, rear, temp;
        for (front = newind, rear = size - 1; front < rear; front++, rear--) {
            temp = arr[front];
            arr[front] = arr[rear];
            arr[rear] = temp;
        }
        // System.out.println(arr);
        for (int num : arr)
            System.out.print(num);
        // return arr;
    }

    static int reverseParticularIndexValues(int num, int pos1, int pos2) {
        int pv1 = (int) Math.pow(10, pos1-1);
        int pv2 = (int) Math.pow(10, pos2-1);
        int dig1 = (num / pv1) % 10;
        int dig2 = (num / pv2) % 10;
        num = num - (dig1 * pv1) - (dig2 * pv2);
        num = num + (dig2 * pv1) + (dig1 * pv2);
        return num;
    }

    static int reverseIndexesfromarange(int num, int pos) {
        int pv = (int) Math.pow(10, pos);
        int dig, res = 0;
        int last = num % pv;
        while (last != 0) {
            dig = last % 10;
            res = res * 10 + dig;
            last /= 10;
        }
        num = (num / pv) * pv + res;
        return num;
    }

    static void nextLargestWithNumber(int num){
        int left = 0 , right = num % 10 , pv = 10 , pos2 = 1,pos1 = num % 10;
        while(num/pv != 0){
            left = (num / pv ) % 10;
            pos2++;
            if(left < right){
                break;
            }
            right = left;
            pv *= 10;
        }
        pv = 1;
        while(pos1<pos2){
            pos1++;
            right = (num / pv ) % 10;
            if(right < left){
                break;
            }
            pv *= 10;
        }
        num = reverseParticularIndexValues(num, pos2, pos1+1);
        num = reverseIndexesfromarange(num, pos2-1);
        System.out.println(num);
    }
}