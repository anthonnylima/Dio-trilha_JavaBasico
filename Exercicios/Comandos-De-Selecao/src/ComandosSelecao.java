public class ComandosSelecao {
    public static void main(String[] args) {
        int notaAluno = 7;

        if(notaAluno<=7){
            System.out.println("Aprovado!");
        } else if (notaAluno<4) {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Recuperação");
        }
    }
}
