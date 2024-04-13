public class CalculSomme {
    // Méthode pour calculer la somme de deux nombres entiers
    public static int calculerSomme(int a, int b) {
        return a + b;
    }
    public static void calculerSommeListe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de nombres à additionner : ");
        int n = scanner.nextInt();
        int[] nombres = new int[n];
        System.out.println("Entrez les " + n + " nombres un par un :");
        for (int i = 0; i < n; i++) {
            nombres[i] = scanner.nextInt();
        }
        int somme = calculerSommeMultiple(nombres);
        System.out.println("La somme des nombres est : " + somme);
        scanner.close();
    }


    public static void main(String[] args) {
        int nombre1 = 10;
        int nombre2 = 20;
        
        // Appel de la méthode calculerSomme et affichage du résultat
        int somme = calculerSomme(nombre1, nombre2);
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }
}
