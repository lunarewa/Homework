public class Compair {
    public static boolean big(int a, int b) {
        boolean s;
        if (a > b) {
            System.out.println(a + " больше чем " + b);
            s = true;
        } else {
            System.out.println(a + " меньше чем " + b);
            s = false;
        }
        return s;
    }

    public static boolean equally(int a, int b) {
        boolean s;
        if (a != b) {
            System.out.println("Числа не равны");
            s = false;
        } else {
            s = true;
            System.out.println("Числа равны");
        }
        return s;
    }
}
