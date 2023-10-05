public class Main {
    public static void main(String[] args) {


       int horasTrabalhadas = 50;
       Funcionario funcionario = new Funcionario("iago", 20);
       funcionario.calcularSalario(horasTrabalhadas);

       funcionario.gerarHolerite(horasTrabalhadas,"03/03/2005");

        Programador programador = new Programador("Iago", 100,100);
        programador.calcularSalario(50);
        programador.gerarHolerite(50,"03/03/205");

    }
}