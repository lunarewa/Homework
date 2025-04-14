
public class Factorial {
        public static int factorial(int a) {
            int f = 1;
            for (int i = 1; i <= a; i++) {
                f *= i;
            }
            System.out.println("Факториал числа " + a + " равен: " + f);
            return f;
        }
    }
