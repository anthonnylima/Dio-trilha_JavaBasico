import java.util.Scanner;

public class FormatadorCep {
    public static String formatarCep(String cep)throws CepInvalidoException{
        if(cep.length()>8){
            throw new CepInvalidoException();
        }
        return cep;
    }

    public static void main(String[] args) throws CepInvalidoException {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite seu cep:");
            String cep = leitor.next();
            formatarCep(cep);
        } catch (CepInvalidoException e){
            System.out.println("Digite um cep valido");
        }
    }
}
