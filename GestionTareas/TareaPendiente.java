package GestionTareas;

public class TareaPendiente {
    private String descripcion;
    private String prioridad;
    private String completada;

    public TareaPendiente(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = "NO";
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCompletada() {
        return completada;
    }
    public void setCompletada(String c) {
        completada = c;
    }


        public void marcarComoCompletada() {
            completada = "SI";
        }

        public String esUrgente () {
        if (prioridad.equals("Alta") && completada.equals("NO")) {
            return "SI";
        } else {
            return "NO";
        }
    }
    }
