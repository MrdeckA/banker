package bj.ifri.banker.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String numero;
    private float capital;
    private String adresseSiege;

    @ElementCollection
    private List<Integer> numSalaries;

    @ElementCollection
    private List<String> villesAgences;

}