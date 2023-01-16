package be.technifutur.java.mvc.models;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class DemoValidationForm {

    @Min(0)
    @Max(15)
    @Positive   //strictement positif
    @Negative
    @PositiveOrZero //+ ou = à 0
    @NegativeOrZero
    private int entier;

    @NotBlank
    @NotNull
    @Null
    @NotEmpty
    @Size(min = 0, max = 10)    //je peux choisir la taille de ma char
    @Pattern(regexp = "[0-9]+") // = suite de chiffre d'une taille
    private String chaine;

    @NotNull
    @Null
    private Object objet;

    @NotNull
    @Null
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent
    private LocalDateTime dateTime;

    @NotNull
    @Null
    @NotEmpty
    @Size(min = 0, max = 10)
    private List<Object> list;

}
