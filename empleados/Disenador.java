package empleados;

import asignaciones.*;
import java.util.*;

public class Disenador extends Empleado {

    public Disenador(int codigo, String nombre, String telefono, String correo) {
        super(codigo, nombre, telefono, correo, "diseñador");
    }
}