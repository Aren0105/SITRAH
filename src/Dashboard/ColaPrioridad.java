package Dashboard;

import Menu_Principal.Nodo;

public class ColaPrioridad {

    private NodoCola inicioEmergencia;
    private NodoCola finEmergencia;

    private NodoCola inicioUrgente;
    private NodoCola finUrgente;

    private NodoCola inicioLeve;
    private NodoCola finLeve;

    public ColaPrioridad() {

        inicioEmergencia = null;
        finEmergencia = null;

        inicioUrgente = null;
        finUrgente = null;

        inicioLeve = null;
        finLeve = null;
    }

    // Encolar paciente según prioridad
    public void encolar(Nodo paciente) {

        NodoCola nuevo = new NodoCola(paciente);

        switch (paciente.getPrioridad()) {

            case "Emergencia":
                if (inicioEmergencia == null) {
                    inicioEmergencia = nuevo;
                    finEmergencia = nuevo;
                } else {
                    finEmergencia.siguiente = nuevo;
                    finEmergencia = nuevo;
                }
                break;

            case "Urgencia":
                if (inicioUrgente == null) {
                    inicioUrgente = nuevo;
                    finUrgente = nuevo;
                } else {
                    finUrgente.siguiente = nuevo;
                    finUrgente = nuevo;
                }
                break;

            default: // Leve
                if (inicioLeve == null) {
                    inicioLeve = nuevo;
                    finLeve = nuevo;
                } else {
                    finLeve.siguiente = nuevo;
                    finLeve = nuevo;
                }
                break;
        }

    }

    // Atender paciente respetando prioridades
    public Nodo atender() {

        if (inicioEmergencia != null) {
            Nodo paciente = inicioEmergencia.paciente;
            inicioEmergencia = inicioEmergencia.siguiente;

            if (inicioEmergencia == null) {
                finEmergencia = null;
            }

            return paciente;
        }

        if (inicioUrgente != null) {

            Nodo paciente = inicioUrgente.paciente;
            inicioUrgente = inicioUrgente.siguiente;

            if (inicioUrgente == null) {
                finUrgente = null;
            }

            return paciente;
        }

        if (inicioLeve != null) {

            Nodo paciente = inicioLeve.paciente;
            inicioLeve = inicioLeve.siguiente;

            if (inicioLeve == null) {
                finLeve = null;
            }

            return paciente;
        }

        return null;
    }

    public boolean estaVacia() {

        return inicioEmergencia == null
                && inicioUrgente == null
                && inicioLeve == null;
    }

    public NodoCola getInicioEmergencia() {
        return inicioEmergencia;
    }

    public NodoCola getInicioUrgente() {
        return inicioUrgente;
    }

    public NodoCola getInicioLeve() {
        return inicioLeve;
    }

    public boolean eliminarPaciente(String codigo) {

        if (eliminarDeCola(codigo, 1)) {
            return true;
        }
        if (eliminarDeCola(codigo, 2)) {
            return true;
        }
        if (eliminarDeCola(codigo, 3)) {
            return true;
        }

        return false;
    }

    private boolean eliminarDeCola(String codigo, int tipo) {

        NodoCola inicio = null;
        NodoCola fin = null;

        switch (tipo) {
            case 1:
                inicio = inicioEmergencia;
                fin = finEmergencia;
                break;
            case 2:
                inicio = inicioUrgente;
                fin = finUrgente;
                break;
            case 3:
                inicio = inicioLeve;
                fin = finLeve;
                break;
        }

        if (inicio == null) {
            return false;
        }

        if (inicio.getPaciente().getCodigoPaciente().equals(codigo)) {
            inicio = inicio.getSiguiente();

            switch (tipo) {
                case 1:
                    inicioEmergencia = inicio;
                    if (inicio == null) {
                        finEmergencia = null;
                    }
                    break;
                case 2:
                    inicioUrgente = inicio;
                    if (inicio == null) {
                        finUrgente = null;
                    }
                    break;
                case 3:
                    inicioLeve = inicio;
                    if (inicio == null) {
                        finLeve = null;
                    }
                    break;
            }

            return true;
        }

        NodoCola anterior = inicio;
        NodoCola actual = inicio.getSiguiente();

        while (actual != null) {
            if (actual.getPaciente().getCodigoPaciente().equals(codigo)) {
                anterior.setSiguiente(actual.getSiguiente());

                if (actual == fin) {
                    switch (tipo) {
                        case 1:
                            finEmergencia = anterior;
                            break;
                        case 2:
                            finUrgente = anterior;
                            break;
                        case 3:
                            finLeve = anterior;
                            break;
                    }
                }
                return true;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }

        return false;
    }
}
