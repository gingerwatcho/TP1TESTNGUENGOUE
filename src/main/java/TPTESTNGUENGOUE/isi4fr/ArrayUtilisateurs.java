package TPTESTNGUENGOUE.isi4fr;

import java.util.ArrayList;
import java.util.List;

import TPTESTNGUENGOUE.isi4fr.EmailInvalidException;
import TPTESTNGUENGOUE.isi4fr.SuppressionInvalidException;
import TPTESTNGUENGOUE.isi4fr.Utilisateur;

public class ArrayUtilisateurs {
    private List<Utilisateur> utilisateurs;

    public ArrayUtilisateurs() {
        utilisateurs = new ArrayList<>();
    }

    public void ajouter(Utilisateur user) throws EmailInvalidException {
        if (!user.getEmail().contains("@")) {
            throw new EmailInvalidException("Email invalide");
        }
        utilisateurs.add(user);
    }

    public void supprimer(String id) throws SuppressionInvalidException {
        Utilisateur foundUser = utilisateurs.stream()
                                            .filter(user -> user.getId().equals(id))
                                            .findFirst()
                                            .orElse(null);
        if (foundUser == null) {
            throw new SuppressionInvalidException("Utilisateur non trouvé pour l'ID: " + id);
        }
        utilisateurs.remove(foundUser);
    }

    public void lister() {
        utilisateurs.forEach(user -> System.out.println(user.getNom() + ", " + user.getAge()));
    }
}
