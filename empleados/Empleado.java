package empleados;

import asignaciones.*;
import java.util.*;

public abstract class Empleado {

    private int codigo;
    private String nombre, telefono, correo, rol;
    protected LinkedList<Asignacion> asignaciones;

    public Empleado(int codigo, String nombre, String telefono, String correo, String rol) {
        this.codigo = codigo; this.nombre = nombre; 
        this.telefono = telefono; this.correo = correo; this.rol = rol;
        this.asignaciones = new LinkedList<Asignacion>();
    }

    public void addAsignacion(Asignacion asignacion) {
        try {

            if (this.rol == "programador") {
                this.asignaciones.add((Programa) asignacion);
    
            } else if (this.rol == "diseñador") {
                this.asignaciones.add((Diseno) asignacion);
    
            } else if (this.rol == "administrador") {
                this.asignaciones.add((Proyecto) asignacion);
            }

        } catch (Exception e) {
            System.out.println("No puedes hacer asignaciones incorrectas\n");
        }
    }

    @Override
    public String toString() {
        String msg = "";

        if (this.asignaciones.size() > 0) {
            msg += "El " + this.rol + " " + this.nombre + " tiene proyectos: \n";
            
            for (Asignacion asignacion : this.asignaciones) {
                msg += "\t" + asignacion + "\n";
            }
        } else {
            msg += "El " + this.rol + " " + this.nombre + " no tiene proyectos asignados \n";
        }


        return msg;
    }
}