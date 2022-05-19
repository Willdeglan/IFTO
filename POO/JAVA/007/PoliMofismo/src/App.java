/**
 * Subtyping com a anotação overridepara a reescrita do codigo.
 * 
 * Ad-hoc ou overloading permite a escrita do mesmo método com parametros deferentes dentro da mesma classe.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();

        p1.saudacao();
        p1.saudacao("Willdeglan");
        
        p1.saudacao("willdeglan", 37);

        a1.saudacao();
        a1.saudacao("Willdeglan");
        a1.saudacao("willdeglan", 37);

    }
}