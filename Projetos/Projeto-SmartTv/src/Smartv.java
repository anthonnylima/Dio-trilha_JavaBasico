import java.util.Scanner;
public class Smartv{

    public static boolean ligarDesligar(boolean ligada){
        return !ligada;
    }

    public static int mudarCanalUmPorVez(int canal){
        return ++canal;
    }

    public static int mudarCanalDireto(int canal, int canalescolhido){
         canal=canalescolhido;
         return canal;
    }

    public static int aumentarVolume(int volume)throws Exception{
        if (volume>=100){
            throw new Exception("O volume ja está no maximo");
        }
        return ++volume;
    }

    public static void main(String[] args) {
        boolean ligada=true;
        int canal=0;
        int volume=99;

        Scanner leitor = new Scanner(System.in);

        int opecao = 0;

        do {
            System.out.println("-Menu SmarTV-");
            System.out.println("1- mudar para proximo canal");
            System.out.println("2- mudar para o canal desejado");
            System.out.println("3 - aumentar o volume");
            System.out.println("4- desligar TV");
            opecao= leitor.nextInt();

            switch (opecao){
                case 1: {
                   canal=mudarCanalUmPorVez(canal);
                    System.out.println(canal);
                    break;
                }

                case 2: {
                    System.out.println("Digite o canal desejado");
                    int canalDesejado= leitor.nextInt();
                    canal=mudarCanalDireto(canal,canalDesejado);
                    System.out.println(canal);
                    break;
                }

                case 3: {
                    try {
                        volume=aumentarVolume(volume);
                        System.out.println(volume);
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                case 4: {
                    ligada=ligarDesligar(ligada);
                    break;
                }

                default:{
                    System.out.println("digite um comando Valido");
                    break;
                }
            }
        }while (ligada);
    }
}