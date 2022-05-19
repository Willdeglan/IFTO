public class App {
    public static void main(String[] args) throws Exception {
        
        Editora edi = new Editora(4562, "Hilp25 Editora", "9254 1255");
        Livros lvr = new Livros(4511, "Fantasia infantil", "W54GF", edi);

        
        lvr.imprimeEdit();
    }
}
