public class Pattern {
    public static void main(String[] args) {
        // xPattern(5 , "Tiger");
        // endStar(5);
        // pyramidStar(5);
        // reversePyramid(5);
        // endAboveStar(5);
        // numberRightTriangle(5);
        // numberRightTriangleColVise(5);
        // sandwich(6);
        // reverseNumberPyramid(4);
        numberPyramid(5);
    }

    static void xPattern(int N, String chr) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j || i + j == N + 1)
                    System.out.print(chr.charAt(i - 1) + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    static void endStar(int row) {
        for (int i = 1; i <= row; i++) {
            for (int col = 1; col <= row; col++) {
                if (col <= row - i) {
                    System.out.print(" " + " ");
                } else
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pyramidStar(int row) {
        for (int i = 1; i <= row; i++) {
            for (int col = 1; col <= (row) - i; col++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void reversePyramid(int row) {
        for (int i = row; i >= 1; i--) {
            for (int col = 1; col <= (row) - i; col++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void endAboveStar(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j < i) {
                    System.out.print(" " + " ");
                } else
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void numberRightTriangle(int N) {
        int count = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void numberRightTriangleColVise(int num) {
        for (int i = 1; i <= num; i++) {
            int val = i, diff = num - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = val + (diff);
                diff--;
            }
            System.out.println();
        }
    }

    static void sandwich(int num) {
        for (int i = 0; i < num; i += 2) {
            int val = num * i + 1;
            for (int j = 1; j <= num; j++) {
                System.out.printf("%02d ", val);
                val = val + 1;
            }
            System.out.println();
        }
        int start = (num / 2) * 2 - 1;
        for (int i = start; i >= 1; i -= 2) {
            int val = num * i + 1;
            for (int j = 1; j <= num; j++) {
                System.out.printf("%02d ", val);
                val = val + 1;
            }
            System.out.println();
        }
    }

    static void reverseNumberPyramid(int num) {
        int val = 1;
        int start = num * num;
        int diff = num - 1;
        for (int i = 1; i <= num; i++) {
            int safe = start;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" " + " " + " ");
            }
            for (int j = 1; j <= (num - i) + 1; j++) {
                System.out.printf("%02d ", val++);
            }
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.printf("%02d ", ++start);
            }
            start = safe - diff;
            diff--;
            System.out.println();
        }
    }

    static void numberPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print(" " + " ");
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
