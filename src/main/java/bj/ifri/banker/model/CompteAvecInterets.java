package bj.ifri.banker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "compte_avec_interets")
public class CompteAvecInterets {

    @Id
    private String numero;
    private float solde;
    private float dateOuverture;
    private float taux;
    private String nomClient;
    private String prenomClient;

    @ManyToOne
    private Agence agenceAvecInterets;

    @ManyToOne
    private Banque banqueAvecInterets;

    @ManyToOne
    private Client client;

}