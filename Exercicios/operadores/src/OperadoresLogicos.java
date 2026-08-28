public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1, condicao2;

        condicao1=true;

        condicao2=true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        condicao2=false;

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("FIm...");
    }
}
