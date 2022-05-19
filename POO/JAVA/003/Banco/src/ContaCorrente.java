public class ContaCorrente extends ContaBancaria {
    
    
    public void depositar(float deposito){
        saldo = saldo + deposito;
        System.out.println("Seu novo saldo:  "+ saldo);
    }

    public void sacar(float Sacado){
        if (saldo > 0) {
            System.out.println("Sacando seu dinheiro ...");
            saldo = saldo - (Sacado + Sacado*0.005);
            System.out.println("\n Saldo Disponivel = |   "+saldo+"   |");
        }else{
            System.out.println("\n Saldo Disponivel = |    0    |");
        }
    }
}
