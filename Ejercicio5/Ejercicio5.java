public class Ejercicio5 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789,
                CuentaBancaria.Tipo.AHORROS, 1.5f);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.calcularNuevoSaldo();
        cuenta.consultarSaldo();
    }
}
