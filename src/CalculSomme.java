public class CalculSomme {
    // Méthode pour calculer la somme de deux nombres entiers
    public static int calculerSomme(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int nombre1 = 10;
        int nombre2 = 20;
        
        // Appel de la méthode calculerSomme et affichage du résultat
        int somme = calculerSomme(nombre1, nombre2);
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }
}
