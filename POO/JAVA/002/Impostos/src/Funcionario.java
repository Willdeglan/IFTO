public class Funcionario extends Pessoa{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaImposto(float sal){
        return (float) (sal * 0.03);
    }

    public Funcionario(float salario){
        this.salario = salario;
    }
}
