public abstract class Pessoa {
        private String nome;
        String nascimento;

        public String getNome() {
                return this.nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getNascimento() {
                return this.nascimento;
        }

        public void setNascimento(String nascimento) {
                this.nascimento = nascimento;
        }

        public abstract void imprimeDados();
        
}
