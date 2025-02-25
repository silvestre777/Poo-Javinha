package componentes;

public class Memoria extends Revoada {
    private double capacidade_de_Armazenamento;

    public Memoria(double capacidade_de_Armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.capacidade_de_Armazenamento = capacidade_de_Armazenamento;
    }

    public double getCapacidade_de_Armazenamento() {
        return capacidade_de_Armazenamento;
    }

    public void setCapacidade_de_Armazenamento(double capacidade_de_Armazenamento) {
        this.capacidade_de_Armazenamento = capacidade_de_Armazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidade_de_Armazenamento=" + capacidade_de_Armazenamento + ", modelo="
                + modelo + "]";
    }




}
