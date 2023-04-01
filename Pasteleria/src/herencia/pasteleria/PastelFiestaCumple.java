package herencia.pasteleria;

public class PastelFiestaCumple extends Pastel{

    //Atributos
    private int velas;
    public PastelFiestaCumple(){setSabor("Chocolate");}
    public int getVelas(){return  this.velas;}
    public void setVelas(int velas) {this.velas=velas;}
}
