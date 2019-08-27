import java.util.Scanner;
public class Exercicio_03 {
    public static void main (String[] args){
        int sair=0, voto, C1=0, C2=0, C3=0, C4=0, NULO=0, BRANCO=0;
	while(sair!=1){
            System.out.println("ELEICAO PRESIDENCIAL, VOTE:");
            System.out.println("VOTE 1 PARA ELEGER O CANDIDATO 1:");
            System.out.println("VOTE 2 PARA ELEGER O CANDIDATO 2:");
            System.out.println("VOTE 3 PARA ELEGER O CANDIDATO 3:");
            System.out.println("VOTE 4 PARA ELEGER O CANDIDATO 4:");
            System.out.println("VOTE 5 PARA VOTAR NULO:");
            System.out.println("VOTE 6 PARA VOTAR EM BRANCO:");
            System.out.println("VOTE 0 PARA SAIR:");
            Scanner entrada = new Scanner (System.in);
            voto = entrada.nextInt();
            switch (voto){
                case 1:
                    C1++;
                    break;
                case 2:
                    C2++;
                    break;
                case 3:
                    C3++;
                    break;
                case 4:
                    C4++;
                    break;
                case 5:
                    NULO++;
                    break;
                case 6:
                    BRANCO++;
                    break;
                case 0:
                    sair=1;
                    break;
                default:
                    System.out.println("Comando Invalido, Digite Novamente! ");
            }
	}
        System.out.println("TOTAL DE VOTOS: ");
        System.out.println("CANDIDADO 1: "+C1);
        System.out.println("CANDIDADO 2: "+C2);
        System.out.println("CANDIDADO 3: "+C3);
        System.out.println("CANDIDADO 4: "+C4);
        System.out.println("NULOS: "+NULO);
        System.out.println("BRANCOS: "+BRANCO);
    }
}