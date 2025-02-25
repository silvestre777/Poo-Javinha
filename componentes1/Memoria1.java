package componentes1;

public class Memoria1 extends Modelo{

    public Memoria1(String marca, String modelo, String capacidadeArmazenamento, String frequencia) {
        super(marca, modelo, capacidadeArmazenamento, frequencia);
    }

    @Override
    public String toString() {
        return "Memoria1 []" + marca + "Modelo: "+ capacidadeArmazenamento + "Frequência: "+ frequencia;
    }



}
