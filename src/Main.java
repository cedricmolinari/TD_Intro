import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        /* Exercice 4
        Écrire un programme qui propose à l'utilisateur d’utiliser les fonctions que vous avez créées dans le terminal.
        En fonction de sa réponse, vous lui demandez les informations nécessaires puis vous retournez la réponse. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle fonction voulez-vous utiliser parmi : carré, max, somme ?");
        String reponse = scanner.nextLine();
        switch(reponse) {
            case "carré":
                System.out.println("Entrer un nombre entier : ");
                int nombre = scanner.nextInt();
                System.out.println("Le carré de ce nombre est : " + carreNombre(nombre));
                break;
            case "max":
                System.out.println("Entrer un premier nombre entier : ");
                int nombre1 = scanner.nextInt();
                System.out.println("Entrer un second nombre entier : ");
                int nombre2 = scanner.nextInt();
                System.out.println("Le nombre le plus grand est : " + nombrePlusGrand(nombre1, nombre2));
                break;
            case "somme":
                System.out.println("Combien de nombres voudrez-vous additionner ?");
                int nbArguments = scanner.nextInt();

                int[] tableauNombres = new int[nbArguments];
                for (int i = 0; i < nbArguments; i++) {
                    System.out.println("Entrer le nombre " + (i + 1) + " : ");
                    tableauNombres[i] = scanner.nextInt();
                }
                System.out.println("La somme de ces nombres est : " + sommeTableau(tableauNombres));
                break;
        }
    }
    public static long carreNombre(int nombre) {
        return (long) nombre * nombre;
    }

    public static int nombrePlusGrand(int a, int b) {
        IntStream nombres = IntStream.of(a, b);
        return nombres.max().getAsInt();
    }

    public static int sommeTableau(int... nombres) {
        return IntStream.of(nombres)
                .sum();
    }
        /*Java fonctions
        TD4 - Java - Objets et héritage
        Exercice 1
        Créez une classe “Personne” qui possède des attributs pour le nom, le prénom et l’âge.
                Définissez un constructeur qui permet d’initialiser les attributs.
                Ajoutez des méthodes getter et setter pour les attributs de la classe
        créez plusieurs instances de la classe “Personne” et utilisant des constructeurs que vous avez définis
        Créez une fonction toString qui renvoie une chaîne de caractères qui présente la personne
        Affichez dans le terminal*/
}