import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Problema:
    /*
        Faça um algoritmo para cadastrar os alunos que estão cursando as disciplinas Matematica I e Contabilidade I.
        Essas disciplinas aceitam 150(matematica) e 100(contabilidade) alunos respectivamente.
        O cadastro deve ser feito pelos números de matriculas dos alunos.
        Feito o cadastro, indique qual ou quais alunos estão cursando as duas disciplinas.

    */

    /*
        Melhoria:
    Solicita o cadastro de alunos para as disciplinas Matemática I e Contabilidade I, respeitando os limites de vagas.
    Armazena as matrículas dos alunos em conjuntos, um para cada disciplina.
    Encontra os alunos que estão cursando ambas as disciplinas.
    Exibe as matrículas dos alunos nas disciplinas individuais e os que estão cursando ambas as disciplinas.
    */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeAlunos;
        int numMatricula;
        int cursandoMatematica = 0;
        int cursandoContabilidade = 0;
        String escolha;

        System.out.println("Quantos alunos vão ser matriculados? ");
        quantidadeAlunos = entrada.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Cadastre o número de mátricula: ");
            numMatricula = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Qual disciplina o aluno vai cursar: " +
                    "\nMatematica I \nContabilidade I.");
            escolha = entrada.nextLine();

            switch (escolha){
                case "Matematica I", "Matematica", "matematica", "matematica I":
                    cursandoMatematica++;
                    break;
                case "Contabilidade I", "Contabilidade","contabilidade", "contabilidade I":
                    cursandoContabilidade++;
                    break;
                default:
                   String mensagem = "Coloque alguma informação";
            }
        }





        System.out.println("Tem " + cursandoMatematica + " alunos matriculados no curso de Matematica I");
        System.out.println("Tem " + cursandoContabilidade + " alunos matriculados no curso de Contabilidade I");

    }

}
