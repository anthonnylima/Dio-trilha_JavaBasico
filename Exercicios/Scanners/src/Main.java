import java.util.Locale;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é:"+nome);
        System.out.println("Sua idade é:"+ idade);
        System.out.println("Sua altura é:"+ altura+" cm");
    }
}