package componentes1;

public class Modelo {


    protected String marca;
    protected String modelo;
    protected String capacidadeArmazenamento;
    protected String frequencia;
    public Modelo(String marca, String modelo, String capacidadeArmazenamento, String frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.frequencia = frequencia;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }
    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    public String getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    



}
