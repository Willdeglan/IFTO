public abstract class Pessoa {
    private String nome;
    private int idade;

    public void fazerAniversario(){
        this.idade++;
    }

    public void trabalhar(){
        System.out.println(x: "Trabalhando...");
    }

    public void estudar(){
        System.out.println(x: "Estandando....");
    }

    public void dormir(){
        System.out.println(x: "Dormindo....");
    }

    public abstract void ocupação();
}
