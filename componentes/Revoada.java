package componentes;

public class Revoada {
    protected String marca;
    protected String modelo;

    public Revoada(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Revoada() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revoada{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }


}
