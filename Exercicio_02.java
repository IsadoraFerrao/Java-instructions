import java.util.Scanner;
public class Exercicio_02 {
    public static void main (String[] args){
        int n_filhos=0;
        float salario=1, maior=0, salario_populacao=0, media_filhos=0;
        float quant_populacao=0, percentual, salario_menor=0;
        Scanner entrada = new Scanner (System.in);
        while(salario > 0) {
            System.out.print("Digite o seu salario: ");
            salario = entrada.nextFloat();
            if (salario > 0){
                System.out.print("DIGITE o seu numero de filhos: ");
                n_filhos = entrada.nextInt();
                quant_populacao++;
                salario_populacao += salario;
                media_filhos += n_filhos;
                if(salario > maior){
                    maior=salario;
                }
                if(salario <= 100){
                    salario_menor++;
                }
            }
        }
        media_filhos = media_filhos/quant_populacao;
        salario_populacao = salario_populacao/quant_populacao;
        percentual=(100*salario_menor)/quant_populacao;    
        System.out.println("Media dos salarios: "+salario_populacao);
        System.out.println("Media dos filhos: "+media_filhos);
        System.out.println("Maior salario: "+maior);
        System.out.println("Percentual de pessoas com salario até R$100,00: "+percentual);
    }
}