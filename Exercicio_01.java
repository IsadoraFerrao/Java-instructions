import java.util.Scanner;
public class Exercicio_01 {
    
    
    public static void main (String[] args) {
	int Numero, Menor, Igual, Maior;
	Scanner entrada = new Scanner(System.in);
	System.out.print("Quantas pessoas participam das Olimpiadas: ");
	Numero = entrada.nextInt();
	if(Numero < 5000){
            System.out.println("Publico Fraco!");
	}
	else if(Numero >= 5000 && Numero <= 20000){
            System.out.println("Publico Bom!");
	}
        else if(Numero > 20000 ){
            System.out.println("Publico Excelente!");
	}
    }
}
