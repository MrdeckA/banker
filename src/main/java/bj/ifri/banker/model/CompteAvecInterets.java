package bj.ifri.banker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Numero", nullable = false)
    private String numero;

    @Column(name = "Solde", nullable = false)
    private float solde;

    @Temporal(TemporalType.DATE)
    @Column(name = "DateOuverture", nullable = false)
    private Date dateouverture;

    @Column(name = "Taux", nullable = false)
    private float taux;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

    @ManyToOne
    @JoinColumn(name = "id_banque")
    private Banque baqnue;

}