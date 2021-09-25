package Banco;

public class Cliente extends Persona {

    private int antiguedad;
    private int sexo;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public Cliente() {
    }

    public Cliente(int antiguedad, int sexo, String numeroDocumento, String nombre, String direccion, String telefono) {
        super(numeroDocumento, nombre, direccion, telefono);
        this.antiguedad = antiguedad;
        this.sexo = sexo;
    }

    //Métodos
     @Override
    public void Mostrar() {
        System.out.println("Datos del cliente: ");
        System.out.println("Documento: "+this.numeroDocumento);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Telefono: "+this.telefono);
        System.out.println("Antigüedad: "+this.antiguedad);
        System.out.println("Sexo: "+this.sexo); 
    }
    
    @Override
    public void Atender(){
        System.out.println("prestando atención a la explicación del cajero");
    }
    
     @Override
    public void Agradecer(){
        System.out.println("Le agradece al cajero por sus servicios y amable atención");
    }
    
    public void Activar(){
        System.out.println("Haciendo la activación de la cuenta con la primera consignación" );
    }
   
    public void Calificar(){
        System.out.println("Evaluando la atención al cliente");
    }

}
