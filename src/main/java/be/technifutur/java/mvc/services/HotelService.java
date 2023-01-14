package be.technifutur.java.mvc.services;
import be.technifutur.java.mvc.models.Hotel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class HotelService {

    //Propriété:
    private final List<Hotel> hotels = new ArrayList<>();


    //Constructeur:
    public HotelService(){
        hotels.add(new Hotel(1,10,"Chantal","HotelSuper3000", "rue menfou",5));
        hotels.add(new Hotel(2,10,"Mireille","HotelYassssQueen","rue menfou",4));
        hotels.add(new Hotel(3,20,"Jacqueline","HotelDeLuxe","rue menfou",3));
        hotels.add(new Hotel(4,31,"Marie-Odile","HotelDodoMaison","rue menfou", 1));
    }


    //Méthodes:
    public List<Hotel> getAll(){
//        return rooms; -> va renvoyer les ref et donc la liste sera modifiable
        return new ArrayList<>(hotels);  //-> renvoie une copie de la liste
    }

    public Hotel getOne(String nom){
        return hotels.stream()
                .filter(hotel -> hotel.getNom().equalsIgnoreCase(nom))  //hotels -> hotel pcq stream applique un filtre pour chaque hotel
                .findFirst()
                .orElseThrow( ()-> new RuntimeException("blabla"));
    }
}
