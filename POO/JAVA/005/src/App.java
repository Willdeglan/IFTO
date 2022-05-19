public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("--------------- Funcionario ------------------");
        
        Funcionario f1 = new Funcionario();

        f1.setNome("Joao");
        f1.setSalario(2600.0);
        f1.imprimeDados();

        System.out.println("----------------Gerente -----------------");

        Gerente g1 = new Gerente();

        g1.setNome("Maria");
        g1.setSalario(3500.0);
        g1.setArea("RH");
        g1.imprimeDados();

        System.out.println("----------------Cliente -----------------");
        
        Cliente c1 = new Cliente();
        c1.setNascimento("01/01/2000");
        c1.setNome("Pedro");
        c1.setCodigo(1);
        c1.imprimeDados();




    }
}
