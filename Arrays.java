public class Arrays {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] zeroOne = {0,1,0,0,1,1,0,1};
        // int[] zeroOneTwo = {0,1,2,0,1,2};
        int[] ten = { 10, 12, 5, 70, 40, 3, 50 };
        // rotateArrayRight(arr, 1);
        // System.out.println();
        // rotateArrayLeft(arr, 2);
        // zeroOneSeggregation(zeroOne);
        // dutchNationalFlag(zeroOneTwo);
        // evenOddSegregation(arr);
        multipleOfTenSeggregation(ten);
    }

    static void rotateArrayRight(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int safe = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = safe;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void rotateArrayLeft(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int safe = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = safe;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void zeroOneSeggregation(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] == 1 && arr[r] == 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            if (arr[l] == 0)
                l++;
            if (arr[r] == 1)
                r--;
        }
        for (int num : arr)
            System.out.print(num + " ");
    }

    // dutch national flag algorithm
    static void dutchNationalFlag(int[] arr) {
        int l = 0, r = arr.length - 1, m = 0;
        while (m <= r) {
            switch (arr[m]) {
                case 0:
                    int temp = arr[m];
                    arr[m] = arr[l];
                    arr[l] = temp;
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    temp = arr[r];
                    arr[r] = arr[m];
                    arr[m] = temp;
                    r--;
                    break;
            }
        }
        for (int num : arr)
            System.out.print(num + " ");
    }

    static void evenOddSegregation(int[] arr) {
        int ind, e_ind, safe, shift, size = arr.length;
        for (ind = 0; ind < size; ind++) {
            while (arr[ind] % 2 == 0)
                ind++;
            for (e_ind = ind; e_ind < size && arr[e_ind] % 2 != 0; e_ind++);
            if (e_ind == size)
                break;
            safe = arr[e_ind];
            for (shift = e_ind - 1; shift >= ind; shift--) {
                arr[shift + 1] = arr[shift];
            }
            arr[ind] = safe;
        }
        for (int num : arr)
            System.out.print(num + " ");

    }

    static void multipleOfTenSeggregation(int[] arr) {
        int ind, e_ind, safe, shift, size = arr.length;
        for (ind = 0; ind < size; ind++) {
            while (arr[ind] % 10 != 0)
                ind++;
            for (e_ind = ind; e_ind < size && arr[e_ind] % 10 == 0; e_ind++);
            if (e_ind == size)
                break;
            safe = arr[e_ind];
            for (shift = e_ind - 1; shift >= ind; shift--) {
                arr[shift + 1] = arr[shift];
            }
            arr[ind] = safe;
        }
        for (int num : arr)
            System.out.print(num + " ");

    }
}
