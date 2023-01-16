package be.technifutur.java.mvc.models;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculatrice {

    @Positive
    private int nb1;
    private int nb2;
    private String operande;


}
