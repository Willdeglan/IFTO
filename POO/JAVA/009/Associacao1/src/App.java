public class App {
    public static void main(String[] args) throws Exception {
        
        Endereco end = new Endereco("Rua das Acaceas", "centro", 56, 7777760);

        Cliente cl = new Cliente("Will", end);

        cl.imprimeInformacao();
    }
}