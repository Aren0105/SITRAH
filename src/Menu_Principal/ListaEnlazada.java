package Menu_Principal;

public class ListaEnlazada {

    Nodo cabeza;
    int contadorPacientes = 0;

    public ListaEnlazada() {
        cabeza = null;
        contadorPacientes = 0;
    }

    //Registrar
    public Nodo Insertar(String nombre, String apellido, String dni, int edad, String sexo, String telefono, String motivo, String prioridad) {

        String codigo = "P00" + (contadorPacientes + 1);
        Nodo nuevo = new Nodo(codigo, nombre, apellido, dni, edad, sexo, telefono, motivo, prioridad, "En espera");

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        contadorPacientes += 1;
        return nuevo;

    }

    // Buscar por DNI
    public Nodo buscarPorDni(String dni) {

        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dni.equalsIgnoreCase(dni)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

// Buscar por código
    public Nodo buscarPorCodigo(String codigo) {

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.codigoPaciente.equalsIgnoreCase(codigo)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Cantidad total de pacientes
    public int totalPacientes() {
        return contadorPacientes;
    }

    // Pacientes atendidos
    public int totalAtendidos() {

        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.estado.equalsIgnoreCase("Atendido")) {
                contador += 1;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    // Pacientes en espera
    public int totalEnEspera() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.estado.equalsIgnoreCase("En espera")) {
                contador += 1;
            }

            actual = actual.siguiente;
        }

        return contador;
    }

    // Pacientes críticos (Emergencia)
    public int totalCriticos() {

        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.prioridad.equals("Emergencia") && actual.estado.equals("En espera")) {
                contador += 1;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public boolean eliminarPorCodigo(String codigo) {

        if (cabeza == null) {
            return false;
        }

        if (cabeza.getCodigoPaciente().equals(codigo)) {
            cabeza = cabeza.getSiguiente();
            contadorPacientes--;
            return true;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.getSiguiente();

        while (actual != null) {

            if (actual.getCodigoPaciente().equals(codigo)) {
                anterior.setSiguiente(actual.getSiguiente());
                contadorPacientes--;
                return true;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }

        return false;
    }
    
    
    /*ESTADISTICAS*/
    public int totalEmergencia() {

        int num = 0;

        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getPrioridad().equals("Emergencia")) {
                num += 1;
            }
            actual = actual.getSiguiente();
        }

        return num;
    }

    public int totalUrgente() {

        int num = 0;

        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getPrioridad().equals("Urgencia")) {
                num += 1;
            }
            actual = actual.getSiguiente();
        }
        return num;
    }

    public int totalLeve() {

        int num = 0;

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPrioridad().equals("Leve")) {
                num += 1;
            }
            actual = actual.getSiguiente();
        }
        return num;
    }

}
