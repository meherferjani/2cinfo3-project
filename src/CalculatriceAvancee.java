public class CalculatriceAvancee {
    public static void main(String[] args) {
        // Exemples d'utilisation des méthodes de calcul
        double resultatAddition = addition(5.5, 3.7);
        System.out.println("Résultat de l'addition : " + resultatAddition);
        double resultatSoustraction = soustraction(10.2, 4.8);
        System.out.println("Résultat de la soustraction : " + resultatSoustraction);

        double resultatMultiplication = multiplication(2.5, 4);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);

        double resultatDivision = division(15, 3);
        System.out.println("Résultat de la division : " + resultatDivision);

    }

    // Méthode pour effectuer une addition
    public static double addition(double a, double b) {
        return a + b;
    }
    // Méthode pour effectuer une soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour effectuer une multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode pour effectuer une division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Division par zéro impossible.");
            return Double.NaN; // Retourne NaN (Not a Number) en cas de division par zéro
        } else {
            return a / b;
        }
    }

   
}
