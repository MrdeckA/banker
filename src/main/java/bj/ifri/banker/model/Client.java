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
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {

  
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Numero", nullable = false)
    private String numero;

    @Column(name = "Nom", nullable = false)
    private String nom;

   @Column(name = "Prenom", nullable = false)
   private String prenom;

    @Column(name = "Adresse", nullable = false)
   private String  adresse;

    @Column(name = "NomConseiller", nullable = false)
   private String  nomconseiller;
   
   
    @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "client")
	private List<CompteBancaire> CompteBancaire = new ArrayList<CompteBancaire>();

    
    @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "client")
	private List<CompteAvecInterets> Client = new ArrayList<CompteAvecInterets>();


    @ManyToOne
    @JoinColumn(name="id_employe")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name="id_agence")
    private Agence  agence;

}
