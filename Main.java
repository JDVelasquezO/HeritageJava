import empleados.*;
import asignaciones.*;

public class Main {
    
    public static void main(String[] args) {
        Empleado programador = new Programador(1, "JD", "24334519", "jd@gmail.com");

        Asignacion programa1 = new Programa("Programa1", "Descripcion 1", "1 mes");
        Asignacion programa2 = new Programa("Programa2", "Descripcion 2", "1 mes");
        
        Empleado disenador = new Disenador(2, "Daniel", "24334519", "daniel@gmail.com");
        Asignacion diseno1 = new Diseno("Diseno1", "Descripcion 3", "1 mes");        
        
        Empleado admin = new Administrador(3, "Gaby", "24334519", "gaby@gmail.com");
        Asignacion proyecto1 = new Proyecto("Proyecto1", "Descripcion 4", "3 meses");
        
        programador.addAsignacion(programa1);
        programador.addAsignacion(programa2);
        
        disenador.addAsignacion(diseno1);
        disenador.addAsignacion(programa2);

        admin.addAsignacion(proyecto1);

        System.out.println(disenador);
        System.out.println(programador);
        System.out.println(admin);
    }
}