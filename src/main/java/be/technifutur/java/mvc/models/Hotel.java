package be.technifutur.java.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    private int id;
    private int nbChambre;
    private String nomReceptionniste;
    private String nom;
    private String adresse;
    private int nbEtoile;


}
