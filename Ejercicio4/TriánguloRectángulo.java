public class TriánguloRectángulo {
    int base;
    int altura;

    TriánguloRectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularÁrea() {
        return base * altura / 2.0;
    }

    double calcularPerímetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    void determinarTipoTriángulo() {
        double hipotenusa = calcularHipotenusa();
        if ((base == altura) && (base == hipotenusa) && (altura == hipotenusa)) {
            System.out.println("Es un triángulo equilátero");
        } else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa)) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
