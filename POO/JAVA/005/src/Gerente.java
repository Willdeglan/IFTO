public class Gerente extends Funcionario{
        private String area;

        public Double calculaImposto(){
                Double novo_salario = this.getSalario() - (this.getSalario()*0.05);
                return novo_salario;
        }

        public String getArea() {
                return this.area;
        }

        public void setArea(String area) {
                this.area = area;
        }


}
