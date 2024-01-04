package bj.ifri.banker.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "agence")
public class Agence {

    @Id
    private String numero;
    private String nom;
    private String adresse;
    private String ville;
    private String codePostal;
    private String nomDirecteur;
    private String nomBanque;

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
}