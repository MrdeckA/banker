package bj.ifri.banker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employe")
public class Employe {
	@Id
	private String nom;
	private String prenom;
	private String adresse;
	private float salaire;
	private int numINSEE;
	private String nomBanque;

	// Méthode factice, veuillez spécifier les détails de la méthode.
	public String[] numerosClientsConseils() {
		return new String[] {};
	}
}
