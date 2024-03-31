package DS23;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Competence c1 = new Competence("Java", 80);
        Competence c2 = new Competence("Python", 75);
        Competence c3 = new Competence("C++", 90);

        Candidat candidat1 = new Candidat("tayssir", 5);

        candidat1.ajoutComp("Java", 80); 
        candidat1.ajoutComp("Python", 75);
        candidat1.ajoutComp("C++", 90);

       
        System.out.println(candidat1);
        


        Competence c4 = new Competence("Java", 80);
        System.out.println("c1 equals c4 ? " + c1.equals(c4)); 

        ArrayList<Competence> competences = new ArrayList<>();
        competences.add(c1);
        competences.add(c2);
        competences.add(c3);
        System.out.println("Avant le tri : "+ competences);
        Collections.sort(competences);
        System.out.println("Après le tri : " + competences);
        
        
        
        Recrutement R= new Recrutement("tttt");
        R.ajoutOffre(1);
        R.postuler(0, candidat1);
        R.postuler(1, candidat1);
        Candidat candidat2 = new Candidat("Ahmed", 7);

        candidat2.ajoutComp("Python", 55);
        candidat2.ajoutComp("C++", 70);
        R.postuler(1, candidat2);
        Candidat candidat3 = new Candidat("Ahmed", 4);

        R.postuler(1, candidat3);
        ArrayList<Candidat> con= R.trierCandidatsParExperience(1);
        for (Candidat c: con ) {
        	System.out.println(c.toString());
        }
        
        R.selectionCandidat(1,"Python");
    }
}
