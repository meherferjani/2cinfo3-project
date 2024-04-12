public class Inverse {
    
    public static void main(String[] args) {
        // Définir une chaîne de caractères
        String phrase = "Bonjour, je suis une phrase de démonstration.";
        
        // Appeler la méthode de traitement et afficher le résultat
        String resultat = inverserPhrase(phrase);
        System.out.println("La phrase inversée est : " + resultat);
    }
    
    // Méthode pour inverser une phrase
    public static String inverserPhrase(String texte) {
        StringBuilder resultat = new StringBuilder();
        for (int i = texte.length() - 1; i >= 0; i--) {
            resultat.append(texte.charAt(i));
        }
        return resultat.toString();
    }
}