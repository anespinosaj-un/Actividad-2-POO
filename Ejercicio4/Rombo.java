public class Rombo {
    double diagonalMayor;
    double diagonalMenor;

    Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularLado() {
        return Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
    }

    double calcularÁrea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerímetro() {
        return 4 * calcularLado();
    }
}
