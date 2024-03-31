package DS23;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Candidat> {

	@Override
	public int compare(Candidat o1, Candidat o2) {
        return Integer.compare(o1.getAnneesExperience(), o2.getAnneesExperience());

	}

}
