public class Ejercicio3 {
    public static void main(String[] args) {
        Automóvil auto1 = new Automóvil("Ford", 2018, 3, Automóvil.TipoCombustible.DIESEL,
                Automóvil.TipoAutomóvil.EJECUTIVO, 5, 6, 250, Automóvil.TipoColor.NEGRO, true);
        auto1.imprimir();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(20);
        System.out.println();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        System.out.println("Tiempo estimado para recorrer 250 km = "
                + auto1.calcularTiempoLlegada(250) + " horas");
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas());

        auto1.acelerar(200);
        auto1.acelerar(160);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas());
        System.out.println("Cantidad de multas = " + auto1.cantidadMultas);
        System.out.println("Valor total de multas = $" + auto1.calcularTotalMultas());
    }
}
