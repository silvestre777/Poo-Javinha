package componentes1;

public class PlacaMae extends Modelo{
    private String soquete;

    public PlacaMae(String marca, String modelo, String capacidadeArmazenamento, String frequencia, String soquete) {
        super(marca, modelo, capacidadeArmazenamento, frequencia);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae [marca=" + marca + ", soquete=" + soquete + ", modelo=" + modelo + "]";
    }



}
