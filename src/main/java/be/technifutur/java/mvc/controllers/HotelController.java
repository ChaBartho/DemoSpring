package be.technifutur.java.mvc.controllers;
import be.technifutur.java.mvc.models.Hotel;
import be.technifutur.java.mvc.services.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@Controller
public class HotelController {

    //Propriété:
    private final HotelService hotelService;

    //Constructeur:
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    //Méthodes:
    //GET - /room/all -> voir les chambres
    @GetMapping("/hotel/all")
    public String allHotels(Model model){
        List<Hotel> hotels = hotelService.getAll();

        model.addAttribute("hotels", hotels);

        return "hotel/all";
    }

    //GET - /room/1 -> voir la chambre num 1
    @GetMapping("/hotel/{nom}")       //{} = paramètre de chemin
    public String oneRoom(Model model, @PathVariable String nom){
        model.addAttribute("hotel", hotelService.getOne( nom ));

        return "hotel/one";
    }

}
