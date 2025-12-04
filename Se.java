public class Se {

    public static int s(int a, int b) {
        return a + b;
    }

    public static int n(int a, int b) {
        return a * b;
    }

    public static int m(int a, int b) {
        return a / b;
    }

    public static int q(int a, int b) {
        return a % b;
    }

    public static int r(int a, int b) {
        int op = a;
        for (int i = 1; i < b ;i++ ) {
            a = a * op ;
        }
    return a;
    }
}

