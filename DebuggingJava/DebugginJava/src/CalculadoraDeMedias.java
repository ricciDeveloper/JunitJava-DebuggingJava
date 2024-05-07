import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruno", "João"};

        double media = calcularMediaDaTurma(alunos, scan);
        System.out.println("Média da turma: "+media);
    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno: alunos){
            System.out.println("Nota do aluno: "+ aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;
    }
}
