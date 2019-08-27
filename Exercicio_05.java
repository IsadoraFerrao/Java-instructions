import java.util.Scanner;
public class Exercicio_05 {
    public static void main (String[] args){
        int [][] impressoes = new int[20][12];
        int i, j, imp_marco=0, imp_ano=0;
        Scanner entrada = new Scanner (System.in);
        for(i=0; i<20; i++){
            for(j=0; j<12; j++){
                System.out.print("Digite o numero de impressoes do professor "+(i+1)+" no mes "+(j+1)+": ");
                impressoes[i][j] = entrada.nextInt();
                System.out.print("\n");
                imp_ano += impressoes[i][j];
            }
        }
        for(i=0; i<20; i++){
            imp_marco += impressoes[i][2];
        }
        System.out.println("Numero de Impressoes no Mes de Marco: "+imp_marco);
        System.out.println("Numero de Impressoes no Ano: "+imp_ano);
    }
}