package be.technifutur.java.mvc.patterns;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Personne {

        //Propriétés:
        @NotBlank
        @NotNull
        @Size(min = 5, max = 20)
        private String prenom;

        @NotBlank
        @NotNull
        @Size(min = 5, max = 20)
        private String nom;

        @Null
        @Past
        private int dateNaissance;


        //Constructeur:
        private Personne(String prenom, String nom){
            this.prenom = prenom;
            this.nom = nom;
        }

        public static Builder builder(String prenom){
            return new Builder(prenom);
        }

        public static class Builder {

            private final String prenom;
            private String nom;

            public Builder(String prenom) {
                this.prenom = prenom;
            }

            public Builder nom(String nom){
                this.nom = nom;
                return this;
            }

            public Personne build(){
                return new Personne(this.prenom, this.nom);
            }

        }

}
