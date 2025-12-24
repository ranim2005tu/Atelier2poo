package atelier2javapoo;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la première valeur entière : ");
        int x = clavier.nextInt();
        System.out.print("Entrez la deuxième valeur entière : ");
        int y = clavier.nextInt();
        int max = Math.max(x, y);
        System.out.println("Le maximum des deux valeurs est : " + max);
        clavier.close();
	}

}
