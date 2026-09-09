import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    final static double SALARIO_BASE=2000;

    public static void main(String[] args) {
        String[] candidatos={"Felipe", "Marcia", "Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
        String[] candidatosSelecionados= new String[5];
        selecionarCandidatos(candidatos,candidatosSelecionados);
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato){
        int numeroLigacoes=0;
        while (numeroLigacoes<3){
            System.out.print("Ligando...\n");
            if(atender()){
                numeroLigacoes++;
                System.out.print("CONSEGUIMOS CONTATO COM O CANDIDATO:"+candidato+", APÓS "+numeroLigacoes+" TENTATIVAS.\n");
                break;
            }
            else {
                System.out.print("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO: "+candidato+"\n");
            }
            numeroLigacoes++;
        }
    }

    public static void analisarCandidato(double salarioPretendido){
        if (salarioPretendido<SALARIO_BASE){
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioPretendido==SALARIO_BASE) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static void selecionarCandidatos(String[] candidatos,String[] candidatosSelecionados){
        int contador=0;
        for (String c: candidatos){;
            double salarioPretendido=valorPretendido();

            if (contador>=5){
                System.out.println("O maximo de candidatos aprovados ja foi preenchido!");
                break;
            }

            if (salarioPretendido<=SALARIO_BASE){
                System.out.println("Candidato:"+c+" foi selecionado. Sua prentenção salarial é de:"+salarioPretendido);
                analisarCandidato(salarioPretendido);
                candidatosSelecionados[contador]=c;
                ++contador;
            }
            else{
                System.out.println("Candidato: "+c+" não foi selecionado. Sua prentenção salarial é de: "+salarioPretendido);
                analisarCandidato(salarioPretendido);
            }
        }
    }

    public static void exibirCandidatosSelecionados(String[] candidatosSelecionados){
        for (int i=0; i<candidatosSelecionados.length;i++){
            System.out.println(candidatosSelecionados[i]);
        }
    }


    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}