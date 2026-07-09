package Dashboard;

public class PilaHistorial {

    private NodoPila cima;

    public PilaHistorial() {
        cima = null;
    }

    // Insertar acción
    public void push(String accion) {

        NodoPila nuevo = new NodoPila(accion);

        nuevo.siguiente = cima;
        cima = nuevo;
    }

    // Eliminar acción más reciente
    public String pop() {

        if (estaVacia()) {
            return null;
        }

        String accion = cima.getAccion();

        cima = cima.siguiente;

        return accion;
    }

    // Ver última acción
    public String peek() {

        if (estaVacia()) {
            return null;
        }

        return cima.getAccion();
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    public NodoPila getCima() {
        return cima;
    }

    public void actualizarPaciente(String codigo, String nombre, String apellido, String prioridad) {

        NodoPila actual = cima;
        while (actual != null) {
            if (actual.accion.contains(codigo)) {
                String[] partes = actual.accion.split("\\|");
                String hora = partes[0].trim();
                actual.accion = hora + " | Atendido: "
                        + codigo
                        + " - "
                        + nombre
                        + " "
                        + apellido
                        + " ["
                        + prioridad
                        + "]";
            }
            actual = actual.siguiente;
        }
    }

    public boolean eliminarPaciente(String codigo) {

        if (cima == null) {
            return false;
        }

        if (cima.accion.contains(codigo)) {
            cima = cima.siguiente;
            return true;
        }

        NodoPila anterior = cima;
        NodoPila actual = cima.siguiente;

        while (actual != null) {

            if (actual.accion.contains(codigo)) {
                anterior.siguiente = actual.siguiente;
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        return false;
    }
}
