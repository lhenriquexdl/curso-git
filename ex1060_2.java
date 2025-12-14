import java.util.Locale;
import java.util.Scanner;

public class ex1060_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();
		
		double soma = 0.0;
		
		if(n1 > 0.0) {
			soma = soma + 1.0;
		}
		if(n2 > 0.0) {
			soma = soma + 1.0;
		}
		if(n3 > 0.0) {
			soma = soma + 1.0;
		}
		if(n4 > 0.0) {
			soma = soma + 1.0;
		}
		if(n5 > 0.0) {
			soma = soma + 1.0;
		}
		if(n6 > 0.0) {
			soma = soma + 1.0;
		}
		
		System.out.printf("%.0f valores positivos %n", soma);
				
		sc.close();

	}

}
