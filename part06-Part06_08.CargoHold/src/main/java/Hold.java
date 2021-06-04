
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitCase) {
        if (this.totalWeight() + suitCase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitCase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }
    
    public String toString() {
        
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

}
