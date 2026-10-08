public class Cuadrado {
    int lado;

    Cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularÁrea() {
        return lado * lado;
    }

    double calcularPerímetro() {
        return 4 * lado;
    }
}
