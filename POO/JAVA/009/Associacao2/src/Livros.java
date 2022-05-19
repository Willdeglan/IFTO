public class Livros {
    
    private int codigo;
    private String descLivro;
    private String ISBN;
    private Editora editora;


    public Livros() {
    }

    public Livros(int codigo, String descLivro, String ISBN, Editora editora) {
        this.codigo = codigo;
        this.descLivro = descLivro;
        this.ISBN = ISBN;
        this.editora = editora;
    }    
    

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescLivro() {
        return this.descLivro;
    }

    public void setDescLivro(String descLivro) {
        this.descLivro = descLivro;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void imprimeEdit(){
        System.out.println(this.getCodigo()+", "+this.getDescLivro()+", "+this.getISBN()+", "+this.getEditora()); 
    }
}
