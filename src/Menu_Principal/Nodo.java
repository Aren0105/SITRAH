
package Menu_Principal;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Nodo {
    String codigoPaciente;
    String nombre;
    String apellido;
    String dni;
    int edad;
    String sexo;
    String telefono;
    String motivo;
    String prioridad;
    String estado;
    String fechaIngreso;
    String horaIngreso;
    Nodo siguiente;

    public Nodo(String codigoPaciente, String nombre, String apellido, String dni, int edad, String sexo, String telefono, String motivo, String prioridad, String estado) {

        this.codigoPaciente = codigoPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.motivo = motivo;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaIngreso = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.horaIngreso = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.siguiente = null;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
    
}
