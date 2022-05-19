public class Cliente extends Pessoa{

        private int codigo;

        public int getCodigo() {
                return this.codigo;
        }

        public void setCodigo(int codigo) {
                this.codigo = codigo;
        }
        
        @Override
        public void imprimeDados(){
                
                System.out.println("Nascimento: " + this.getNascimento());
                System.out.println("Nome: " + this.getNome());
                System.out.println("Codigo: " + this.codigo);

        }
        
}
