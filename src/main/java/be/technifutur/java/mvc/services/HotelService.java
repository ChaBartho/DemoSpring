package be.technifutur.java.mvc.services;
import be.technifutur.java.mvc.models.Hotel;
import be.technifutur.java.mvc.models.HotelForm;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class HotelService {

    //Propriété:
    private final List<Hotel> hotels = new ArrayList<>();


    //Constructeur:
    public HotelService(){
        hotels.add(new Hotel(1,3,200,"Chantal","HotelSuper3000", "rue menfou"));
        hotels.add(new Hotel(2,3,200, "Mireille","HotelYassssQueen","rue menfou"));
        hotels.add(new Hotel(3,2,200, "Jacqueline","HotelDeLuxe","rue menfou"));
        hotels.add(new Hotel(4,1,200, "Marie-Odile","HotelDodoMaison","rue menfou"));
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

    public void addHotel(HotelForm hotelForm){
        hotels.add(new Hotel(hotelForm.getId(), hotelForm.getNbEtoile(), hotelForm.getNbChambre(), hotelForm.getNomReceptionniste(), hotelForm.getNom(), hotelForm.getAdresse()));
    }
}
