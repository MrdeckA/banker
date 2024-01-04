package bj.ifri.banker.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.CascadeType;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "agence")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Numero", nullable = false)
    private String numero;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Adresse", nullable = false)
    private String adresse;

    @Column(name = "Ville", nullable = false)
    private String ville;

    @Column(name = "CodePostal", nullable = false)
    private String codepostal;

    @Column(name = "NomDirecteur", nullable = false)
    private String nomdirecteur;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "agence")
    private List<Employe> Employe = new ArrayList<Employe>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "agence")
    private List<CompteBancaire> CompteBancaire = new ArrayList<CompteBancaire>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "agence")
    private List<Client> Client = new ArrayList<Client>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "agence")
    private List<CompteAvecInterets> CompteAvecInterets = new ArrayList<CompteAvecInterets>();

    @ManyToOne
    @JoinColumn(name = "id_banque")
    private Banque banque;

}

// public List<String> numerosComptesAvecInterets() {
// // Logique pour obtenir les numéros des comptes avec intérêts
// // Retourne une liste de numéros de comptes
// // Exemple : return
// // comptesAvecInterets.stream().map(CompteAvecInterets::getNumero).toList();
// }

// public List<String> numerosComptesSansInterets() {
// // Logique pour obtenir les numéros des comptes sans intérêts
// // Retourne une liste de numéros de comptes
// // Exemple : return
// // comptesSansInterets.stream().map(CompteBancaire::getNumero).toList();
// }

// public List<String> listeComptes() {
// // Logique pour obtenir les numéros de tous les comptes de l'agence
// // Retourne une liste de numéros de comptes
// // Exemple : return concatenerListes(numerosComptesAvecInterets(),
// // numerosComptesSansInterets());
// }

// public List<Employe> listeEmployes() {
// // Retourne la liste des employés de l'agence
// // Exemple : return employes;
// }

// // Méthode privée pour concaténer deux listes
// private List<String> concatenerListes(List<String> liste1, List<String>
// liste2) {
// // Logique pour concaténer les deux listes
// // Exemple : List<String> result = new ArrayList<>(liste1);
// // result.addAll(liste2);
// // return result;
// }
