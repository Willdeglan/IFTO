//Essa clase destina-se a um grupo de pessoas comuns
public final class ClienteNormal extends Cliente {
    
    @Override
    public void cancelarReserva(boolean cancelar){
        if (cancelar) {
            Double getValorPassagem = getValorPassagem()*0.7;
            System.out.println("Sua reserva de Passagem foi CANCELADO com Sucesso.");
            System.out.println("Cliente Prime:-------------------------");
            System.out.print("Reenbolso de 70% da passagem paga no valor de R$ "+getValorPassagem);
            System.out.println("\n\nMuito Obrigado e volte sempre que precisa.");
        }
    } 
}
