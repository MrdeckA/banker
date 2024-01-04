package bj.ifri.banker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employe")
public class Employe {


	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Prenom", nullable = false)
    private String prenom;

   @Column(name = "Adresse", nullable = false)
   private String adresse;

   @Column(name = "Salaire", nullable = false)
   private float salaire;

   @Column(name = "NumInsee", nullable = false)
   private int numinsee;
   
    @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "employe")
	private List<Client> Client = new ArrayList<Client>();

   @ManyToOne
   @JoinColumn(name="id_agence")
   private Agence agence;

	// Méthode factice, veuillez spécifier les détails de la méthode.
	
}
