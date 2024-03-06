import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        /* Exercice 3 : Écrire une fonction qui retourne la somme des nombres d’un tableau donné en paramètre */

        int parametreTableau = sommeTableau(4, 98, 65, 34, 3);

        System.out.println("La somme du tableau donné en paramètre est : " + parametreTableau);
    }
    public static int sommeTableau(int... nombres) {
        return IntStream.of(nombres)
                .sum();
    }

        /*Java fonctions

        Exercice 4
        Écrire un programme qui propose à l'utilisateur d’utiliser les fonctions que vous avez créées dans le terminal.
        En fonction de sa réponse, vous lui demandez les informations nécessaires puis vous retournez la réponse.
        TD4 - Java - Objets et héritage
        Exercice 1
        Créez une classe “Personne” qui possède des attributs pour le nom, le prénom et l’âge.
                Définissez un constructeur qui permet d’initialiser les attributs.
                Ajoutez des méthodes getter et setter pour les attributs de la classe
        créez plusieurs instances de la classe “Personne” et utilisant des constructeurs que vous avez définis
        Créez une fonction toString qui renvoie une chaîne de caractères qui présente la personne
        Affichez dans le terminal*/
}