package componentes1;

public class DispositivoDeArmazenamento extends Modelo{

    private String tipo_de_conexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String frequencia,
            String tipo_de_conexao) {
        super(marca, modelo, capacidadeArmazenamento, frequencia);
        this.tipo_de_conexao = tipo_de_conexao;
    }

    public String getTipo_de_conexao() {
        return tipo_de_conexao;
    }

    public void setTipo_de_conexao(String tipo_de_conexao) {
        this.tipo_de_conexao = tipo_de_conexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento [marca=" + marca + ", modelo=" + modelo + ", tipo_de_conexao="
                + tipo_de_conexao + ", capacidadeArmazenamento=" + capacidadeArmazenamento + "]";
    }

    
}
