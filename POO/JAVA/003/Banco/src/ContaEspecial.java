public final class ContaEspecial extends ContaCorrente {
    private double limite;

    // Metodo.
    public void sacar(float Sacado){
        if (saldo >= limite) {
            System.out.println("Sacando seu dinheiro ...");
            saldo = saldo - (Sacado + Sacado*0.001);
            System.out.println("\n Saldo Disponivel = |   "+saldo+"   |");
        }else{
            System.out.println("\n Saldo Disponivel = |    0    |");
        }
    }

    // Get e Set.
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        if (limite > 0) {
            this.limite = limite*(-1);
        } else {
            this.limite = limite;
        }
    }
}
