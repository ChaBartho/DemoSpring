package be.technifutur.java.mvc.controllers;
import be.technifutur.java.mvc.models.Hotel;
import be.technifutur.java.mvc.models.HotelForm;
import be.technifutur.java.mvc.services.HotelService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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




    @GetMapping("/hotel/add")    // = CHEMIN vers ma DB PAS vers la vue
    public String input (Model model){
        model.addAttribute("hotel", new HotelForm());

        return "hotel/hotelForm";   // = CHEMIN vers la VUE
    }

    @PostMapping("/hotel/add")  //DB
    public String process (Model model, @Valid HotelForm hotelform){
        hotelService.addHotel(hotelform);
     return "redirect:/hotel/all";   // VUE
    }

}
