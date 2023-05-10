import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Hiring {
    public static void main(String[] args) {

        Map<String, Integer> highsec = new HashMap<>();
        highsec.put("Maths", 80);
        highsec.put("Physics", 75);
        highsec.put("Chemistry", 85);

        Students s1 = new Students("Sivaranjani", "23/08/2001", highsec, 8.89, 8.5, 5, 86, "Indian");
        Students s2 = new Students("Siva", "23/10/2001", highsec, 8.1, 6.1, 5, 86, "Indian");
        Students s3 = new Students("Ranjani", "23/06/1995", highsec, 8.1, 9.1, 5, 86, "Indian");
        Students s4 = new Students("Renu", "12/06/2002", highsec, 8.1, 9.1, 5, 86, "Indian");

        List<Students> candidates = List.of(s1, s2, s3, s4);
        HumanResource hrTeam = new HumanResource();
        List<Students> qualifiedCandidates = hrTeam.getQualifiedCandidates(candidates);

        System.out.println("\n\nQualified candidates details: \n");
        hrTeam.printEligibleCandidatesDetails(qualifiedCandidates);
        System.out.println("\n\n");
        hrTeam.SelectedCandidates(candidates);
        System.out.println("\n\n");

    }
}