package DS23;

import java.util.*;

public class Candidat{
	private String nom;
	private int anneesExperience;
	private ArrayList<Competence> comp;

	public Candidat(String nom, int anneesExperience) {
		this.nom = nom;
		this.comp = new ArrayList<Competence>();
		this.anneesExperience = anneesExperience;
	}

	public String getNom() {
		return nom;
	}

	public int getAnneesExperience() {
		return anneesExperience;
	}

	public ArrayList<Competence> getComp() {
		return comp;
	}

	public void setComp(ArrayList<Competence> comp) {
		this.comp = comp;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAnneesExperience(int anneesExperience) {
		this.anneesExperience = anneesExperience;
	}

	public void ajoutComp(String langage, int score) {
	    Competence nouvelleCompetence = new Competence(langage, score);
	    for (Competence competence : comp) {
	        if (competence.equals(nouvelleCompetence)) {
	            System.out.println("La compétence " + nouvelleCompetence.toString() + " existe déjà pour ce candidat.");
	            return;
	        }
	    }
	    comp.add(nouvelleCompetence);
	}


	@Override
	public String toString() {
	    Collections.sort(comp);

		String compet = " ";

		for (Competence c : comp) {

			compet += c.toString() + " ";

		}

		return "Candidat [nom=" + nom + ", anneesExperience=" + anneesExperience + ", comp = " + compet + "]";
	}

	

}
