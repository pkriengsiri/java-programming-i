public class Bird {

    private String name;
    private String latinName;
    private int sightings;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.sightings = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getSightings() {
        return this.sightings;
    }
    
    public void addObservation() {
        this.sightings++;
    }
    
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.sightings + " observations";
    }
    
}
