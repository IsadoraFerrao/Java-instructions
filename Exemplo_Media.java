import java.util.Scanner;
public class Exemplo_Media {
    public static void main (String[] args){
        float n1, n2, media;
        Scanner entrada = new Scanner(System.in);
	System.out.println("Media entre 2 notas: ");
	System.out.print("Digite a 1o nota: ");
	n1 = entrada.nextFloat();
	System.out.print("Digite a 2o nota: ");
	n2 = entrada.nextFloat();
	media = (n1+n2)/2;
	System.out.println("Media: "+media);
    }	
}