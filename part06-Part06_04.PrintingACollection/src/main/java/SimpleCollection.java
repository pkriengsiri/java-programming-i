
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(this.elements.isEmpty()) {
            return "The collection "+this.name+" is empty.";
        }
        
        String allElements = "";
        
        for(int i = 0; i < this.elements.size(); i++) {
            if(i == this.elements.size()-1) {
                allElements += this.elements.get(i);
            } else {
                allElements += this.elements.get(i)+"\n";
            }
            
            
        }
        
        String word = "element";
        
        if(this.elements.size() > 1) {
            word = "elements";
        }
        
        return "The collection "+this.name+" has "+this.elements.size()+" "+word+":"+"\n"+allElements;
        
        
    }
    
}
