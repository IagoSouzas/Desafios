public class Holerite extends Funcionario {
    private Funcionario funcionario;

    public Holerite(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void imprimir(int horasTrabalhadas, String mesAno){
        System.out.println(funcionario);
        System.out.println("Data: "+ mesAno);
        System.out.println("Valor do Salário:"+ funcionario.calcularSalario(horasTrabalhadas));
        System.out.println("---------------------");
    }
}
