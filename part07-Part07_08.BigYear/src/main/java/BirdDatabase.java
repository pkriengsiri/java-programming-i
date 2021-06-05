
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> observations;

    public BirdDatabase() {
        this.observations = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.observations.add(bird);
    }

    public void one(String name) {
        for (Bird bird : observations) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }

    public void all() {
        for (Bird bird : observations) {
            System.out.println(bird);
        }
    }

    public void observe(String name) {
        for (Bird bird : observations) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            } 
        }
        System.out.println("Not a bird");
    }

}
