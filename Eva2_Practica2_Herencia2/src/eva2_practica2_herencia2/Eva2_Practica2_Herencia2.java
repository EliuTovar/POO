/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica2_herencia2;

/**
 *
 * @author tovar
 */
public class Eva2_Practica2_Herencia2 {

    /**
     * @param args the command line arguments
     */
    /*
    is a --> es un
    has a--> tiene un
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire = new Direccion("5ta", 100, "x", "0011", "Chihuahua", "Chihuahua", "001122");
        Estudiante estu1 = new Estudiante("9955295", "RUBEN", 40, dire);
        estu1.imprimirDatos();
        
    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }
    

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
        
        
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imrprimirDireccion(){
        System.out.println("Calle " + calle + " #" + numero + ", col." + colonia + 
                "\n CP: " + cp + ", en " + ciudad + "," + estado);
    }
}

   

//RELACION INS-A --> Estudiante ES UNA Persona
class Estudiante extends Persona{
    private String numControl;
    //  ESTO ES UN OBJETO, PERO SIN INSTANCIAR, LO VAMOS A INSTANCIAR EN EL CONSTRUCTOR
    private Direccion direccion; //HAS-A --> ESTUDIANTE TIENE UNA Direccion
    
    public Estudiante() {//INICIALIZAR
        super();//la llamada al super deba ser (preferentemente) la primera instruccion
        this.numControl = "";
        //INSTANCIAR DIRECCION
        direccion = new Direccion();
    }

    public Estudiante(String numControl, String nombre, int edad, Direccion direccion) {
        super(nombre, edad);
        this.numControl = numControl;
        this.direccion = direccion;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de control: " + numControl);
        direccion.imrprimirDireccion();
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() { //Constructor default
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) { //Constructor con argumentos
        this.nombre = nombre;
        this.edad = edad;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
