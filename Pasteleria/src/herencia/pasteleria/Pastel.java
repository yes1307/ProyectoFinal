package herencia.pasteleria;
public class Pastel{
    //Atributos
    private String sabor;
    private double precio;
    public Pastel() {setSaborDefinido();}
//Metodos
    public String getSabor(){return  this.sabor;}
    public double getPrecio(){return  this.precio;}
    public void setPrecio(double precio) {this.precio=precio;}
    public void setSabor(String sabor) {this.sabor=sabor;}
    public void setSaborDefinido() {this.sabor="Vainilla";}
}
