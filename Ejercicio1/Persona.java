public class Persona {
    String nombre;
    String apellido;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String PaisNacimiento;
    char género;

    Persona(String nombre, String apellido, String númeroDocumentoIdentidad, int añoNacimiento, String PaisNacimiento, char género) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.género = género;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de Nacimiento = " + PaisNacimiento);
        System.out.println("Género = " + género);
        System.out.println();
    }
}
