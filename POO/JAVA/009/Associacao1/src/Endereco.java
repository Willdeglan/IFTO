public class Endereco {
    
    private String rua;
    private String bairro;
    private int numero;
    private int cep;


    public Endereco() {
    }

    public Endereco(String rua, String bairro, int numero, int cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    

    @Override
    public String toString() {
        return "{" +
            " rua='" + getRua() + "'" +
            ", bairro='" + getBairro() + "'" +
            ", numero='" + getNumero() + "'" +
            ", cep='" + getCep() + "'" +
            "}";
    }
}
