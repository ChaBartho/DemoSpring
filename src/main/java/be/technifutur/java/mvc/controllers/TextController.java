package be.technifutur.java.mvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class TextController {

    @GetMapping("/text/{nbr:[0-9]+}")
    public String displayMessageRandom(Model model, @PathVariable int nbr){

        List<String> mots = new ArrayList<>();
        Random rdm = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i =0; i < nbr; i++){
            int taille = rdm.nextInt(5,11);
            for (int j = 0; j < taille; j++) {
                sb.append((char)rdm.nextInt('a', 'z'+1));
            }
            mots.add(sb.toString());
        }
        model.addAttribute("mots", mots);

        return "display-mots";
    }









}
