package appli.accueil;

public class Liste {
    private String idListe;
    private String nom;

    public Liste(String idListe, String nom) {
        this.idListe = idListe;
        this.nom = nom;
    }

    public String getIdListe() {
        return idListe;
    }

    public void setIdListe(String idListe) {
        this.idListe = idListe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}