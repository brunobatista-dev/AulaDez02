public class Aluno {
    // Atributos sugeridos
    String nome;
    String matricula;
    double nota1;
    double nota2;

    
    
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

  
    public boolean aprovado() {
        return calcularMedia() >= 6.0;
    }

  
    public void exibirBoletim() {
        double media = calcularMedia();
        String situacao = aprovado() ? "APROVADO" : "REPROVADO";

        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}