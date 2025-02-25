package componentes1;

public class Processador1 extends Modelo{

    public Processador1(String marca, String modelo, String capacidadeArmazenamento, String frequencia) {
        super(marca, modelo, capacidadeArmazenamento, frequencia);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo + "Frequência: " + frequencia;
    }



}
