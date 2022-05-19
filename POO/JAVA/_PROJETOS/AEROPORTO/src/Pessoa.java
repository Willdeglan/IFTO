//Esta clase Abstrata será a responsável com guardar e propagar seus métodos aos seus sucessores.
public abstract class Pessoa {

    //Neste ponto declarei a Variável com seu método Get/Set.
    private int codigo;
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    //Neste ponto declarei a Variável com seu método Get/Set.
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //Neste ponto declarei a Variável com seu método Get/Set.
    private int idade;
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    //Neste ponto declarei a Variável com seu método Get/Set.
    private String sexo;
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}