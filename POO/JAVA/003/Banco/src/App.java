import java.io.IOException;

public class App {
    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {
        Start at = new Start();
        ContaPoupanca cPoupanca = new ContaPoupanca();
        ContaCorrente cCorrente = new ContaCorrente();
        ContaEspecial cEspecial  = new ContaEspecial();
        
        clearScreen();
        at.folder();
        System.out.println("----------------CONTA POUPANCA------------------");       
        cPoupanca.setCliente("Willdeglan da Silva");
        cPoupanca.setNumConta(1001);
        cPoupanca.setSaldo(10900);
        System.out.println("Cliente: "+cPoupanca.getCliente());
        System.out.println("Conta n: "+cPoupanca.getNumConta());
        System.out.println("Saldo: "+cPoupanca.getSaldo());
        System.out.println("--------------------------------------\nSaque:\n");
        cPoupanca.sacar();
        System.out.println("--------------------------------------\nDeposito:\n");
        cPoupanca.depositar(100);
        at.folderFim();

        clearScreen();
        at.folder();
        System.out.println("----------------CONTA CORRENTE------------------");       
        cCorrente.setCliente("Willdeglan Gomes");
        cCorrente.setNumConta(1541);
        cCorrente.setSaldo(15500);
        System.out.println("Cliente: "+cCorrente.getCliente());
        System.out.println("Conta n: "+cCorrente.getNumConta());
        System.out.println("Saldo: "+cCorrente.getSaldo());
        System.out.println("--------------------------------------\nSaque:\n");
        cCorrente.sacar(1500);
        System.out.println("--------------------------------------\nDeposito:\n");
        cCorrente.depositar(1000);
        at.folderFim();

        clearScreen();
        at.folder();
        System.out.println("----------------CONTA ESPECIAL------------------");       
        cEspecial.setCliente("Willdeglan PROPRIETARIO");
        cEspecial.setNumConta(15041);
        cEspecial.setLimite(50000);
        cEspecial.setSaldo(155050);
        System.out.println("Cliente: "+cEspecial.getCliente());
        System.out.println("Conta n: "+cEspecial.getNumConta());
        System.out.println("Saldo: "+cEspecial.getSaldo());
        System.out.println("== LIMITE == "+cEspecial.getLimite()*(-1));
        System.out.println("--------------------------------------\nSaque:\n");
        cEspecial.sacar(50100);
        System.out.println("--------------------------------------\nDeposito:\n");
        cEspecial.depositar(105900);
        at.folderFim();
    }
}
