/*import java.util.Scanner;
import java.util.Random;

// 4.1 - Goldbach
public class Goldbach {
    static boolean estePrim(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu valoarea m (inceput interval): ");
        int m = sc.nextInt();
        System.out.print("Introdu valoarea n (final interval): ");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (estePrim(j) && estePrim(i - j)) {
                        System.out.println(i + " = " + j + " + " + (i - j));
                        break;
                    }
                }
            }
        }
    }
}

// 4.2 - Newton
class Newton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = "); double a = sc.nextDouble();
        System.out.print("b = "); double b = sc.nextDouble();
        System.out.print("c = "); double c = sc.nextDouble();
        System.out.print("x0 = "); double x = sc.nextDouble();
        System.out.print("epsilon = "); double e = sc.nextDouble();

        int n = 0;
        while (true) {
            double fx = a * x * x + b * x + c;
            double fpx = 2 * a * x + b;
            double x1 = x - fx / fpx;
            n++;
            if (Math.abs(x1 - x) < e) {
                System.out.println("Solutie: " + x1);
                System.out.println("Iteratii: " + n);
                break;
            }
            x = x1;
        }
    }
}

// 4.3 - Vocale si consoane
class VocaleConsoane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Scrie un text: ");
        String s = sc.nextLine().toLowerCase();

        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }

        System.out.println("Vocale: " + v);
        System.out.println("Consoane: " + c);

        System.out.print("Vocală de căutat: ");
        char vch = sc.next().toLowerCase().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == vch) System.out.print(i + " ");
        }
    }
}

// 4.4 - Sanse loterie
class SanseLoterie {
    public static void main(String[] args) {
        long n = 49, k = 6;
        long c = 1;
        for (int i = 0; i < k; i++) {
            c = c * (n - i) / (i + 1);
        }
        System.out.println("Sanse: 1 / " + c);
    }
}

// 4.5 - Extragere loterie
class ExtragereLoterie {
    public static void main(String[] args) {
        boolean[] extras = new boolean[50];
        int count = 0;

        while (count < 6) {
            int nr = (int)(Math.random() * 49) + 1;
            if (!extras[nr]) {
                System.out.print(nr + " ");
                extras[nr] = true;
                count++;
            }
        }
    }
}

// 4.6 - Afisare ordine fara sortare
class AfisareFaraSortare {
    public static void main(String[] args) {
        long b = 0;

        while (Long.bitCount(b) < 6) {
            int nr = (int)(Math.random() * 49) + 1;
            b |= (1L << nr);
        }

        System.out.print("Crescator: ");
        for (int i = 1; i <= 49; i++) {
            if ((b & (1L << i)) != 0) System.out.print(i + " ");
        }

        System.out.print("\nDescrescator: ");
        for (int i = 49; i >= 1; i--) {
            if ((b & (1L << i)) != 0) System.out.print(i + " ");
        }
    }
}

 */