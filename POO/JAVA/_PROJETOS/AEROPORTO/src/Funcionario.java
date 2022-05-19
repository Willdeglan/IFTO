import java.util.Scanner;

//Foi cliado a classe para representar os funcionários da empresa.
public class Funcionario extends Pessoa {
    
    //Aqui foi declarado uma variavel com seus métodos Get/Set.
    private int cadastro;
    public int getCadasto(){
        return cadastro;
    }
    public void setCadastro(int cadastro){
        this.cadastro = cadastro;
    }

    //Aqui tem o método para registro de ponto dos funcionários com a verificação se o valor foi digitado corretamente como se pede.
    public void  registrarPonto(){
        Scanner s2 = new Scanner(System.in);
        boolean a = true;
        int ponto = 0;

        do{
            try {
                System.out.print("Digite seu codigo de Funcionario (Numerico): ");
                ponto = s2.nextInt();
            } catch (Exception e) {
                System.out.println("--- Codigo Invalido.");
                a = false;
            }
        } while(a);
        setCadastro(ponto);
        s2.close();
    }
}
