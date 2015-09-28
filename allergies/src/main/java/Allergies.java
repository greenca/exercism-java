import java.util.ArrayList;
import java.util.List;

public class Allergies {

    private List<Allergen> allergens = new ArrayList<>();

    public Allergies(int score) {
        List<Integer> allergen_scores = new ArrayList<>();
        int num_scores = (int)Math.floor(Math.log(score)/Math.log(2));
        for (int i=num_scores; i>=0; i--) {
            if (score >= Math.pow(2, i)) {
                allergen_scores.add((int)Math.pow(2,i));
                score -= Math.pow(2, i);
            }
        }
        for (Allergen a : Allergen.values()) {
            if (allergen_scores.contains(a.getScore())) {
                allergens.add(a);
            }
        }
    }

    public boolean isAllergicTo(Allergen a) {
        return allergens.contains(a);
    }

    public List<Allergen> getList() {
        return allergens;
    }
}
