public class Editora {
    
    private int codEditora;
    private String razaoSocial;
    private String telefone;


    public Editora() {
    }

    public Editora(int codEditora, String razaoSocial, String telefone) {
        this.codEditora = codEditora;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
    }


    public int getCodEditora() {
        return this.codEditora;
    }

    public void setCodEditora(int codEditora) {
        this.codEditora = codEditora;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "{" +
            " codEditora='" + getCodEditora() + "'" +
            ", razaoSocial='" + getRazaoSocial() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }

}
