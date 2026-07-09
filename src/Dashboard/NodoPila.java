
package Dashboard;


public class NodoPila {
    String accion;
    NodoPila siguiente;

    public NodoPila(String accion) {
        this.accion = accion;
        this.siguiente = null;
    }

    public String getAccion() {
        return accion;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }
}
