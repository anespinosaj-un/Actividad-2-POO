public class Ejercicio4 {
    public static void main(String[] args) {
        Círculo figura1 = new Círculo(2);
        Rectángulo figura2 = new Rectángulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TriánguloRectángulo figura4 = new TriánguloRectángulo(3, 5);
        Rombo figura5 = new Rombo(8, 6);
        Trapecio figura6 = new Trapecio(10, 4, 4, 5, 5);

        System.out.println("El área del círculo es = " + figura1.calcularÁrea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
        System.out.println();

        System.out.println("El área del rectángulo es = " + figura2.calcularÁrea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
        System.out.println();

        System.out.println("El área del cuadrado es = " + figura3.calcularÁrea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();

        System.out.println("El área del triángulo es = " + figura4.calcularÁrea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
        System.out.println();

        System.out.println("El área del rombo es = " + figura5.calcularÁrea());
        System.out.println("El perímetro del rombo es = " + figura5.calcularPerímetro());
        System.out.println();

        System.out.println("El área del trapecio es = " + figura6.calcularÁrea());
        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerímetro());
    }
}
