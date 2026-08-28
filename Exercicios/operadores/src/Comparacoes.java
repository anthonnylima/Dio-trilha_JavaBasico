public class Comparacoes {
    public static void main(String[] args) {
        int a,b;

        a=1;
        b=2;

        boolean verdadeFalso= a==b;

        System.out.print(verdadeFalso);

        verdadeFalso = a!=b;

        System.out.print(verdadeFalso);

        String nome1= "Anthonny";
        String nome2= new String("Anthonny");

        verdadeFalso=nome1.equals(nome2);

        System.out.print(verdadeFalso);

        nome2 = "anthonny";

        verdadeFalso=nome1.equals(nome2);

        System.out.print(verdadeFalso);

        verdadeFalso=nome1.equalsIgnoreCase(nome2);

        System.out.print(verdadeFalso);
    }
}
