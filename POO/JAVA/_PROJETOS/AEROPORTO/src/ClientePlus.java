//Esta classe destina-se a especificar um grupo de clientes especiais
public final class ClientePlus extends Cliente {
    
    //Aqui foi declarado uma variável com seus métodos Get/Set
    private int codigoPlus;
    public int getCodigoPlus(){
        return codigoPlus;
    }
    public void setCodigoPlus(int codigoPlus){
        this.codigoPlus = codigoPlus;
    }


    //Aqui começa os métodos desta classe.
    //Foi dado 5% de desconto com o Código Plus a ser abatido no valor final. 
    public void  desconto(){
        setCodigoPlus(5);
    }

    //Imprime uma mensagem indicando a prioridade de atendimento.
    public void filaPrioritaria(){
        System.out.println("***** Fila de Atendimento Prioritaria *****");
    }

    //Imprime uma mensagem indicando o tipo de assento.
    public void  assentoPlus(){
        System.out.println("*_Assento Especial_*");
    }

    //Imprime uma mensagem indicando o tipo de benefício do criente Plus.
    public void  bebidaExclusiva(){
        System.out.println("Cortesia: __ Uisque Black __");
    }

    //Faz uso do método cancelar reserva indicado no método cliente.
    @Override
    public void cancelarReserva(boolean cancelar){
        if (cancelar) {
            Double getValorPassagem = getValorPassagem()*0.9;
            System.out.println("Sua reserva de Passagem foi CANCELADO com Sucesso.");
            System.out.println("Cliente Plus:-------------------------");
            System.out.print("Reenbolso de 90% da passagem paga no valor de R$ "+getValorPassagem);
            System.out.println("\n\nMuito Obrigado e volte sempre que precisa.");
        }
    }
}
