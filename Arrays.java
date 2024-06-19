public class Arrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // rotateArrayRight(arr, 1);
        System.out.println();
        rotateArrayLeft(arr, 2);
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
}
