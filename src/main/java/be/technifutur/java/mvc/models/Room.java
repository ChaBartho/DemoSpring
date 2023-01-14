package be.technifutur.java.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // -> au moment de la compilation, elle va rajouter du code (getter et setter)
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    private int numRoom;
    private int nbSimpleBed;
    private int nbDoubleBed;
    private int size;

}
