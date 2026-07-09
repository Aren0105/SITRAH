package Dashboard;

import Menu_Principal.Nodo;

public class NodoCola {

    Nodo paciente;
    NodoCola siguiente;

    public NodoCola(Nodo paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }

    public Nodo getPaciente() {
        return paciente;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
