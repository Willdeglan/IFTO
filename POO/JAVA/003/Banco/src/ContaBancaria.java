public abstract class ContaBancaria {
    private String cliente;
    private int numConta;
    protected double saldo;

    //Metodos.
    public void sacar(){}

    public void depositar(){}


    //Gets e Sets.
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
}
