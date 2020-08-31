package empleados;

public class Administrador extends Empleado {

    public Administrador(int codigo, String nombre, String telefono, String correo) {

        super(codigo, nombre, telefono, correo, "administrador");
    }
}