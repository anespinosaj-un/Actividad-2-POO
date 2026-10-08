public class Automóvil {
    enum TipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    enum TipoAutomóvil {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    enum TipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}

    String marca;
    int modelo;
    int motor;
    TipoCombustible tipoCombustible;
    TipoAutomóvil tipoAutomóvil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    TipoColor color;
    int velocidadActual = 0;
    boolean automático;
    int cantidadMultas = 0;
    double valorMultas = 0;
    static final double VALOR_MULTA = 500000;

    Automóvil(String marca, int modelo, int motor, TipoCombustible tipoCombustible,
              TipoAutomóvil tipoAutomóvil, int númeroPuertas, int cantidadAsientos,
              int velocidadMáxima, TipoColor color, boolean automático) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.automático = automático;
    }

    String getMarca() { return marca; }
    int getModelo() { return modelo; }
    int getMotor() { return motor; }
    TipoCombustible getTipoCombustible() { return tipoCombustible; }
    TipoAutomóvil getTipoAutomóvil() { return tipoAutomóvil; }
    int getNúmeroPuertas() { return númeroPuertas; }
    int getCantidadAsientos() { return cantidadAsientos; }
    int getVelocidadMáxima() { return velocidadMáxima; }
    TipoColor getColor() { return color; }
    int getVelocidadActual() { return velocidadActual; }
    boolean getAutomático() { return automático; }

    void setMarca(String marca) { this.marca = marca; }
    void setModelo(int modelo) { this.modelo = modelo; }
    void setMotor(int motor) { this.motor = motor; }
    void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }
    void setTipoAutomóvil(TipoAutomóvil tipoAutomóvil) { this.tipoAutomóvil = tipoAutomóvil; }
    void setNúmeroPuertas(int númeroPuertas) { this.númeroPuertas = númeroPuertas; }
    void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }
    void setVelocidadMáxima(int velocidadMáxima) { this.velocidadMáxima = velocidadMáxima; }
    void setColor(TipoColor color) { this.color = color; }
    void setVelocidadActual(int velocidadActual) { this.velocidadActual = velocidadActual; }
    void setAutomático(boolean automático) { this.automático = automático; }

    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMáxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            cantidadMultas++;
            valorMultas = valorMultas + VALOR_MULTA;
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            System.out.println("Se ha generado una multa de $" + VALOR_MULTA);
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return (double) distancia / velocidadActual;
    }

    boolean tieneMultas() {
        return cantidadMultas > 0;
    }

    double calcularTotalMultas() {
        return valorMultas;
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
        System.out.println("Automático = " + automático);
    }
}
