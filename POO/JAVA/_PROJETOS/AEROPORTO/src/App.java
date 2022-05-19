import java.io.IOException;

public class App {

    //Aqui eu utiliso um metodo para verificar ser uma String contem valor Numerico.
    public static boolean checkString(String caracter) { 
        if (caracter == null || caracter.equals("")) {
            System.out.println("Dado não computado.");
            return false;
        }
        try {
            int intValor = Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            System.out.println("Caracter numerico invalido.");
        }
        return false;
    }

    //Eu utiliso para limpar tela em uma rotima repetitiva
    public static void limpaTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().wait();
    }

    public static void main(String[] args) throws Exception {
        
    }
}
