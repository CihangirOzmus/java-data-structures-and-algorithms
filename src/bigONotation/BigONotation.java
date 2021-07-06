package bigONotation;

public class BigONotation {
    public static void constantTimeExample(int n) {
        System.out.println("Constant time example: " + n);
        System.out.println("Constant time example: " + n);
        System.out.println("Constant time example: " + n);
    }

    public static void logarithmicTimeExample(int n) {
        for (int i = 1; i <= n; i *= 2) {
            System.out.println("Linear time example: " + i);
        }
    }

    public static void linearTimeExample(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Linear time example: " + i);
        }
    }

    public static void logLinearTimeExample(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                System.out.println("Loglinear time: " + i + " and " + j);
            }
        }
    }

    public static void quadraticTimeExample(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Quadratic time: " + i + " and " + j);
            }
        }
    }

    public static void exponentialTimeExample(int n) {
        for (int i = 1; i <= Math.pow(2, n); i++) {
            System.out.println("Exponential time: " + i);
        }
    }

    public static void factorialTimeExample(int n) {
        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Factorial time: " + i);
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void combinedTimeExample(int n) {
        System.out.println("Combined time example: " + n);
        System.out.println("Combined time example: " + n);

        for (int i = 1; i <= n; i++) {
            System.out.println("Combined time example first loop(i): " + i);
        }

        for (int j = 1; j <= n; j++) {
            System.out.println("Combined time example second loop(j): " + j);
        }

        for (int k = 1; k <= n; k++) {
            for (int p = 1; p <= n; p++) {
                System.out.println("Combined time example third nested loop(k, p): " + k + " & " + p);
            }
        }
    }

    public static void combinedTimeExample2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Combined time example first nested loop(i, j): " + i + " & " + j);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Combined time example second nested loop(i, j): " + i + " & " + j);
            }
        }
    }

    public static void importantExample(int n, int m) {
        System.out.println("Combined time example: " + n);
        System.out.println("Combined time example: " + m);

        for (int i = 1; i <= n; i++) {
            System.out.println("Combined time example first loop(i): " + i);
        }

        for (int j = 1; j <= m; j++) {
            System.out.println("Combined time example second loop(j): " + j);
        }
    }

    public static void importantExample2(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println("Combined time example: " + i + " " + j);
            }
        }
    }


    public static int linearSearch(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
                System.out.println("Completed with " + count + " steps");
                return i;
            }
            count++;
        }

        System.out.println("Completed with " + count + " steps");

        return -1;
    }

    public static int binarySearchWithIterative(int[] array, int target){
        int count = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                count++;
                System.out.println("Completed with " + count + " steps");
                return middle;
            }

            if (target < array[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }

            count++;
        }

        System.out.println("Completed with " + count + " steps");

        return -1;
    }
}
