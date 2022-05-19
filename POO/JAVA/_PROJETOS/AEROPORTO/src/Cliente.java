//Utilização da classe Random par gerar valores aleatórios.
import java.util.Random;

//Nesta clase será implementada algumas funcionalidade sobre o cliente
public class Cliente extends Pessoa {

        //Declaração de variável da classe Random.
        Random r1 = new Random();
    
        //Neste ponto eu declarei a variavel com seus métodos Get/Set
        private int numeroPassagem;
        public int getNumeroPassagem(){
            return numeroPassagem;
        }
        public void setNumeroPassagem(int numeroPassagem){
            this.numeroPassagem = numeroPassagem;
        }

        //Neste ponto eu declarei a variavel com seus métodos Get/Set
        private String numeroAssento;
        public String getNumeroAssento(){
            return numeroAssento;
        }
        public void setNumeroAssento(String numeroAssento){
            this.numeroAssento = numeroAssento;
        }

        //Neste ponto eu declarei a variavel com seus métodos Get/Set
        private double valorPassagem = 256;
        public double getValorPassagem(){
            return valorPassagem;
        }
        public void setValorPassagem(double valorPassagem){
            this.valorPassagem = valorPassagem;
        }

        
        //inicio dos métodos aplicados
        public void fazerCheckin(){
            System.out.println("___ Checkin realizado com sucesso. ___");
        }
    
        //Aqui eu gerei um valor qualquer ente 1 e 50 para o assento utilizando a classe Random.
        public void comprarPoltrona(){
            int pol = r1.nextInt( 50)+1;
            setNumeroAssento(String.valueOf(pol));
        }
    
        //Aqui o método apenas exibe uma Mensagem de confirmação de reserva de passagem.
        public void reserva(){
            System.out.println("Reserva de Passagem feita com SUCESSO.");
        }
    
        //Método de cancelamento a ser implementados nos métodos filhos.
        public void cancelarReserva(boolean cancelar){}
}
