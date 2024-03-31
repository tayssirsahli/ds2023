package DS23;

import java.util.*;

public class Recrutement {
	private String nomdelacompagnie;
	private Set<Integer> jobs;
	private Map<Integer, Set<Candidat>> candidatures;

	public Recrutement(String nomdelacompagnie) {
		this.nomdelacompagnie = nomdelacompagnie;
		this.jobs = new HashSet<Integer>();
		this.candidatures = new HashMap<Integer, Set<Candidat>>();
	}

	public void ajoutOffre(int jobid) {
		if (jobs.contains(jobid))
			System.out.println("L'ID du job existe déjà !");
		else {
			jobs.add(jobid);
			candidatures.put(jobid, new HashSet<Candidat>());
		}
	}

	public void postuler(int jobid, Candidat c) {
		if(jobs.contains(jobid))	
		{
			candidatures.get(jobid).add(c);
			
		}else {
			System.out.println("L'ID du job n'existe plus !");
		}
			}

	public ArrayList<Candidat> trierCandidatsParExperience(int jobid) {
	    ArrayList<Candidat> candidats = new ArrayList<>(candidatures.get(jobid));
	    ExperienceComparator comparator = new ExperienceComparator();
	    Collections.sort(candidats, comparator);
	    return candidats;
	}

		
	

	public void selectionCandidat(int jobid, String nomCompetence) {
	    if (!candidatures.containsKey(jobid)) {
	        System.out.println("L'ID du job n'existe pas !");
	        return;
	    }

	    Set<Candidat> candidats = candidatures.get(jobid);

	    int count = 0;

	    Candidat candidatMaxScore = null;
	    int maxScore = Integer.MIN_VALUE;

	    for (Candidat candidat : candidats) {
	        for (Competence competence : candidat.getComp()) {
	            if (competence.getNom().equals(nomCompetence)) {
	                count++;
	                if (competence.getScore() > maxScore) {
	                    maxScore = competence.getScore();
	                    candidatMaxScore = candidat;
	                }
	                break; 
	            }
	        }
	    }

	    System.out.println("Nombre de candidats possédant la compétence " + nomCompetence + ": " + count);
	    if (candidatMaxScore != null) {
	        System.out.println("Candidat avec le score le plus élevé pour cette compétence: " + candidatMaxScore.getNom() +
	                ", Score: " + maxScore);
	    } else {
	        System.out.println("Aucun candidat ne possède la compétence " + nomCompetence);
	    }
	}


	
	
}
