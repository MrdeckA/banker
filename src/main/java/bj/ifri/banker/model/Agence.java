package bj.ifri.banker.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "id_banque")
    private Banque banque;

}
