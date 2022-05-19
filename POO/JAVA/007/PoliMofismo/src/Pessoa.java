public class Pessoa {
    
    public void saudacao(String nome){
        System.out.println("Ola "+nome+" Tudo bem?");
    }

    public void saudacao(String nome, int idade){
        System.out.println("Ola "+nome+" Tudo bem? Voce tem "+idade+" anos.");
    }

    public void saudacao(){
        System.out.println("Ola, Tudo bem?");
    }
}
