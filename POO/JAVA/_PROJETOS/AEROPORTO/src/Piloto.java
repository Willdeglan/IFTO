//Classes importadas para finalizades randomica e escanear uma valor solicitado ao usuario no telado.
import java.util.Random;
import java.util.Scanner;

//Foi criado a classe Piloto para um grupo específico de grupo.
public final class Piloto extends Funcionario {
    
    //Aqui foi declarado uma variável com seus métodos Get/Set.
    private int numeroRegistro;
    public int getNumeroRegistro(){
        return numeroRegistro;
    }
    public void setNumeroGegistro(int numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }


    //Aqui temos nos métodos da classe Piloto.
    //Eu faço a coleta do RG do piloto de faço o teste de validação.
    public void numeroRegistro(){
        Scanner s3 = new Scanner(System.in);
        boolean a = true;
        int rg = 0;
        
        do{
            try {
                System.out.print("Digite seu RG de Piloto (Numerico): ");
                rg = s3.nextInt();
            } catch (Exception e) {
                System.out.println("--- Codigo Invalido.");
                a = false;
            }
        } while(a);
        setNumeroGegistro(rg);
        s3.close();
        }

    //Aqui eu mostro uma mensagem de inicio de voou.
    public void iniciarVoo(){
        System.out.println("Seus vou estar iniciando agora ...");
    }

    //Utiliso uma classe para gerar um codio de voou qualquer entre 52 e 588.
    public void registrarVooCompleto(){
        Random r2 = new Random();
        int voo = r2.nextInt(546)+53;

        System.out.println("Voou de numero: == "+voo+" ==");
    }
}
