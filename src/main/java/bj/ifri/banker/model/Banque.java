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
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "banque")
public class Banque {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Numero", nullable = false)
    private String numero;

    @Column(name = "Capital", nullable = false)
    private float capital;

   @Column(name = "AdresseSiege", nullable = false)
   private String adressesiege;

 @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "banque")
	private List<CompteBancaire> CompteBancaire = new ArrayList<CompteBancaire>();

    @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "banque")
	private List<Client> Client = new ArrayList<Client>();


     @JsonIgnore   
@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "banque")
	private List<CompteAvecInterets> CompteAvecInterets = new ArrayList<CompteAvecInterets>();

}