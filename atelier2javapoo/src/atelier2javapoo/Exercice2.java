package atelier2javapoo;

public class Exercice2 {

	public static void main(String[] args) {
		int z=0,x = 0,y = 0,compteur=0,total=0,q = 0,diviseur = 0;
		z = x++ + y;
		if (compteur > 10) System.out.println("compteur est plus grand que 10");
		total -= --x;
		q = q % diviseur;
		q %= diviseur;
		int somme, x1;
		x1 = 1;
		somme = 0;
		somme += x1;
		System.out.println("la somme vaut : " + somme);
		while (x1 <= 10) {
            somme += x1;
            x1++;            
        }
		System.out.println("la somme vaut : " + somme);

	}

}
