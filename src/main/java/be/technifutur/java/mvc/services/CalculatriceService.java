package be.technifutur.java.mvc.services;

import be.technifutur.java.mvc.models.Calculatrice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {

    public int calcul(Calculatrice calculatrice){
        int nb1 = calculatrice.getNb1();
        int nb2 = calculatrice.getNb2();
        String ope = calculatrice.getOperande();
        int result = 0;

        switch(ope){
            case "+" -> result = nb1 + nb2;
            case "-" -> result = nb1 - nb2;
            case "/" -> result = nb1 / nb2;
            case "*" -> result = nb1 * nb2;
            case "%" -> result = nb1 % nb2;
        }
        return result;
    }


}
