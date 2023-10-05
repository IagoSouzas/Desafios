public class Funcionario {
    private String nome;
    private double valorHora;
    private double salario;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected double calcularSalario(int horasTrabalhadas){
        double salario = horasTrabalhadas * valorHora;
        setSalario(salario);
        return salario;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        Holerite holerite = new Holerite(this);
        holerite.imprimir(horasTrabalhadas, mesAno);
        return holerite;
    }
    @Override
    public String toString() {
        return "Nome do funcionário: " + getNome();
    }

}
