public class Personne {
    /*Créez une classe “Personne” qui possède des attributs pour le nom, le prénom et l’âge.
    Définissez un constructeur qui permet d’initialiser les attributs.
    Ajoutez des méthodes getter et setter pour les attributs de la classe*/

    private String nom;
    private String prenom;
    private int age;
    Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cette personne se nomme " + nom + " " + prenom + " et elle est âgée de " + age + " ans.";
    }

}
