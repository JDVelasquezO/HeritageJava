package asignaciones;

public abstract class Asignacion {

    private String titulo, descripcion, tiempo;

    public Asignacion(String titulo, String descripcion, String tiempo) {
        this.titulo = titulo; this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}