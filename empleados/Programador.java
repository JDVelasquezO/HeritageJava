package empleados;

import asignaciones.*;
import java.util.*;

public class Programador extends Empleado {

    public Programador(int codigo, String nombre, String telefono, String correo) {
        super(codigo, nombre, telefono, correo, "programador");
    }
}