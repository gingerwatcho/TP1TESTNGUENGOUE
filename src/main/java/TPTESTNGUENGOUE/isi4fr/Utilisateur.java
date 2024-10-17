package TPTESTNGUENGOUE.isi4fr;

public class Utilisateur {
    private String id;
    private String nom;
    private int age;
    private String email;
    private String telephone;
    private double soldePersonnel;

    public Utilisateur(String id, String nom, int age, String email, String telephone, double soldePersonnel) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.soldePersonnel = soldePersonnel;
    }

    // Getters et Setters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public double getSoldePersonnel() { return soldePersonnel; }

    public void setEmail(String email) { this.email = email; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public void setSoldePersonnel(double soldePersonnel) { this.soldePersonnel = soldePersonnel; }
}

// Exception pour les e-mails invalides
class EmailInvalidException extends Exception {
    public EmailInvalidException(String message) {
        super(message);
    }
}

// Exception pour la suppression invalide
class SuppressionInvalidException extends Exception {
    public SuppressionInvalidException(String message) {
        super(message);
    }
}
