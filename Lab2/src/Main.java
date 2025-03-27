/*
// Exercițiul 4.1 - TestAritmetic

import java.util.Random;

public class TestAritmetic {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Suma: " + (a + b));
        System.out.println("Diferenta: " + (a - b));
        System.out.println("Inmultire: " + (a * b));
        if (b != 0) {
            System.out.println("Impartire: " + (a / b));
            System.out.println("Rest: " + (a % b));
        } else {
            System.out.println("Nu se poate imparti la 0");
        }
    }
}


// Exercițiul 4.2 - GeneratorPseudo
public class GeneratorPseudo {
    public static void main(String[] args) {
        int r = 12345;
        for (int i = 0; i < 10; i++) {
            r = ((r * 25173) + 13849) % 65536;
            System.out.println("Numar generat: " + r);
        }
    }
}


// Exercițiul 4.3 - Minime
public class Minime {
    static int minim3(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    }

    static int minim4(int a, int b, int c, int d) {
        return minim3(minim3(a, b, c), d, d);
    }

    public static void main(String[] args) {
        int x = 4, y = 2, z = 8, w = 1;

        System.out.println("Minim 3: " + minim3(x, y, z));
        System.out.println("Minim 4: " + minim4(x, y, z, w));
    }
}


// Exercițiul 4.5 - FunctieCalcul
import java.util.Scanner;

public class FunctieCalcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu valoarea lui x: ");
        double x = scanner.nextDouble();
        double f;

        if (x < 0) {
            f = x * x + 4 * x + 4;
        } else if (x == 0) {
            f = 0;
        } else {
            f = x * x + 5 * x;
        }

        System.out.println("f(x) = " + f);
    }
}


// Exercițiul 5 - Factorial
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar intre 1 si 12: ");
        int n = scanner.nextInt();
        int fact = 1;

        if (n > 0 && n < 13) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(n + "! = " + fact);
        } else {
            System.out.println("Numarul trebuie sa fie intre 1 si 12!");
        }
    }
}
*/