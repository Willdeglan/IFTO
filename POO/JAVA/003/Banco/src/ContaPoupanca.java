public final class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    //Metodos.
    public double calularNovoSaldo(float taxa){
        double novoSaldo = saldo*diaRendimento*taxa;
        return novoSaldo;
    }

    public void depositar(float deposito){
        saldo = saldo + deposito;
        System.out.println("Seu novo saldo:  "+ saldo);
    }

    public void sacar(){
        if (saldo > 0) {
            System.out.println("Sacando seu dinheiro ...");
        }else{
            System.out.println("| Sem Saldo Disponivel |");
        }
    }

    //Gets e Sets.
    public int getDiaRendimento(){
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }
}
