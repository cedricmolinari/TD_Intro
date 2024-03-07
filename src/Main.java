import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        /* Java fonctions
        TD4 - Java - Objets et héritage
        Exercice 1
        Créez une classe “Personne” qui possède des attributs pour le nom, le prénom et l’âge.
                Définissez un constructeur qui permet d’initialiser les attributs.
                Ajoutez des méthodes getter et setter pour les attributs de la classe
        créez plusieurs instances de la classe “Personne” et utilisant des constructeurs que vous avez définis
        Créez une fonction toString qui renvoie une chaîne de caractères qui présente la personne
        Affichez dans le terminal. */

        Personne cedric = new Personne("Molinari", "Cédric", 39);
        Personne laurence = new Personne("Molinari", "Laurence", 46);
        System.out.println(laurence);


    }


}