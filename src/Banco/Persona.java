/*La empresa Company ODS está reclutando desarrolladores para su equipo de trabajo con el fin de construir 
un sistema de información en el lenguaje de programación JAVA para sus clientes.
El paso en esta entrevista ahora es construir la clase cliente, donde el cliente tiene número de documento,
nombre, dirección, teléfono y cree una clase cajero donde el cajero tendría un documento, nombre, 
dirección, teléfono y fecha de ingreso. Crear una clase padre o súper clase persona de la cual deben 
heredar el cliente y el cajero.
Aparte deben crear las funciones necesarias del cliente y el cajero.
Se deberá realizar un menú al usuario para que interactúe con el programa desarrollado.*/
package Banco;

public abstract class Persona {

    protected String numeroDocumento;
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona() {
    }

    public Persona(String numeroDocumento, String nombre, String direccion, String telefono) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //métodos
    public abstract void Mostrar();
    
    public abstract void Atender();
    
    public void Agradecer(){
        System.out.println("Despedida y agradecimentos");
    }    
}
