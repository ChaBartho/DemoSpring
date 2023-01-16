package be.technifutur.java.mvc.controllers;
import be.technifutur.java.mvc.models.Calculatrice;
import be.technifutur.java.mvc.services.CalculatriceService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatriceController {

    private final CalculatriceService calculatriceService;


    public CalculatriceController(CalculatriceService calculatriceService){
        this.calculatriceService = calculatriceService;
    }


    @GetMapping("/calculatrice/input") //= premiere étape, ce que voit l'utilisateur (1)
    public String input(Model model, Calculatrice calculatrice){
        model.addAttribute("calculatrice", new Calculatrice());
        return "/calculatrice/insert";
    }

    @PostMapping("/calculatrice/calcul")  //= l'action du formulaire = submit    (2)
    public String calcul(Model model, @Valid Calculatrice calculatrice){
        int result;
        result = calculatriceService.calcul(calculatrice);

        model.addAttribute("result", result);

        return "/calculatrice/result";
    }





}
