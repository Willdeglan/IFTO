public class Funcionario extends Pessoa{

        private Double salario;

        public Double calculaImposto(){
                Double novo_salario = this.salario - (this.salario*0.03);
                return novo_salario;
        }

        @Override
        public void imprimeDados(){
                System.out.println("Nome: " + this.getNome());
                System.out.println("Salario: " + this.salario);
                System.out.println("Novo Salario: " + this.calculaImposto());

        }

        public Double getSalario() {
                return this.salario;
        }

        public void setSalario(Double salario) {
                this.salario = salario;
        }

        
        
        
}
