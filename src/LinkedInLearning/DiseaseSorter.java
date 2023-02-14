package LinkedInLearning;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

    public static void main(String[] args) {

        Disease polio = new Disease("Polio", true);
        Disease bacteria = new Disease("Bacteria", true);
        Disease cordyceps = new Disease("Cordyceps", false);

        List<Disease> diseases = new ArrayList<>();
        diseases.add(polio);
        diseases.add(bacteria);
        diseases.add(cordyceps);

        for (Disease disease : diseases) {
            if (disease.isCurable()) {
                System.out.println(disease.getName());
            } else {
                System.out.println("cute");
            }
        }


    }
}
