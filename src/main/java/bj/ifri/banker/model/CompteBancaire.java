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
@Table(name = "compte_bancaire")
public class CompteBancaire {

    @Id
    private String numero;
    private float solde;
    private float dateOuverture;
    private String nomClient;
    private String prenomClient;

    @ManyToOne
    private Agence agence;

    @ManyToOne
    private Banque banque;

    @ManyToOne
    private Client client;

}