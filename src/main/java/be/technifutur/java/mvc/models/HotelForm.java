package be.technifutur.java.mvc.models;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelForm {

    @PositiveOrZero
    private int id;

    @PositiveOrZero
    @Max(5)
    private int nbEtoile;

    @PositiveOrZero
    private int nbChambre;

    @NotBlank
    @Size(max = 100)
    private String nomReceptionniste;

    @NotBlank
    @Size(max = 100)
    private String nom;

    @NotBlank
    @Size(max = 200)
    private String adresse;

}
