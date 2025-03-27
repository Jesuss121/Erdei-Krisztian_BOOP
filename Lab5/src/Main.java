/*
// Clasa Complex.java

public class Complex {
    double re; // partea reala
    double im; // partea imaginara

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex aduna(Complex c) {
        return new Complex(this.re + c.re, this.im + c.im);
    }

    public Complex scade(Complex c) {
        return new Complex(this.re - c.re, this.im - c.im);
    }

    public Complex inmultire(Complex c) {
        double real = this.re * c.re - this.im * c.im;
        double imag = this.re * c.im + this.im * c.re;
        return new Complex(real, imag);
    }

    public Complex inmultireCuScalar(double k) {
        return new Complex(this.re * k, this.im * k);
    }

    public String toString() {
        return re + " + " + im + "i";
    }
}


// Clasa MatriceComplexa.java

public class MatriceComplexa {
    Complex[][] matrice;
    int linii;
    int coloane;

    public MatriceComplexa(int linii, int coloane) {
        this.linii = linii;
        this.coloane = coloane;
        matrice = new Complex[linii][coloane];
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                matrice[i][j] = new Complex(0, 0);
            }
        }
    }

    public MatriceComplexa aduna(MatriceComplexa m) {
        MatriceComplexa rezultat = new MatriceComplexa(linii, coloane);
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                rezultat.matrice[i][j] = this.matrice[i][j].aduna(m.matrice[i][j]);
            }
        }
        return rezultat;
    }

    public MatriceComplexa inmultireCuScalar(double k) {
        MatriceComplexa rezultat = new MatriceComplexa(linii, coloane);
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                rezultat.matrice[i][j] = this.matrice[i][j].inmultireCuScalar(k);
            }
        }
        return rezultat;
    }

    public void afiseaza() {
        for (int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++) {
                System.out.print(matrice[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
*/