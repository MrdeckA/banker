package bj.ifri.banker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    private String numero;
    private String nom;
    private String prenom;
    private String adresse;
    private String nomConseiller;

    @ElementCollection
    private List<String> numerosComptesAvecInterets;

    @ElementCollection
    private List<String> numerosComptesSansInterets;

    @OneToMany(mappedBy = "client")
    private List<CompteAvecInterets> comptesAvecInterets;

    @OneToMany(mappedBy = "client")
    private List<CompteBancaire> comptesSansInterets;

    // Méthodes

    public List<String> numerosComptesAvecInterets() {
        return numerosComptesAvecInterets;
    }

    public List<String> numerosComptesSansInterets() {
        return numerosComptesSansInterets;
    }

    public List<CompteAvecInterets> listeComptesAvecInterets() {
        return comptesAvecInterets;
    }

    public List<CompteBancaire> listeComptesSansInterets() {
        return comptesSansInterets;
    }

}
