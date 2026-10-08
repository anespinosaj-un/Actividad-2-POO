public class Trapecio {
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularÁrea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    double calcularPerímetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
