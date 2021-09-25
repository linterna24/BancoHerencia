package Banco;

public class Cajero extends Persona {

    private String fechaIngreso;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Cajero() {

    }

    public Cajero(String fechaIngreso, double salario, String numeroDocumento, String nombre, String direccion, String telefono) {
        super(numeroDocumento, nombre, direccion, telefono);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    @Override
    public void Mostrar() {
        System.out.println("Datos del cajero: ");
        System.out.println("Documento: " + this.numeroDocumento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Fecha de ingreso: " + this.fechaIngreso);
        System.out.println("Salario: " + this.salario);
    }

    @Override
    public void Atender() {
        System.out.println("Explicandole al cliente, sobre las cuentas y el monto mínimo para activar su cuenta");
    }

    @Override
    public void Agradecer() {
        System.out.println("Despide y agradece al cliente por escoger los productos de este banco");
    }

    public void Despachar() {
        System.out.println("Tomando los datos del cliente");
    }

    public void ReportarVentas() {
        System.out.println("Inscribiendo en sistema, los contratos nuevos, hechos en el dia");
    }

}
