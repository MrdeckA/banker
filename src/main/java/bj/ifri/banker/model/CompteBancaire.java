package bj.ifri.banker.model;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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