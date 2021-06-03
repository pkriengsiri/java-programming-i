/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pete
 */
public class Archive {
    private String identifier;
    
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String toString() {
        return this.identifier+": "+this.name;
    }
    
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        
        if(!(object instanceof Archive)) {
            return false;
        }
        
        Archive archiveToCompare = (Archive) object;
        
        return this.identifier.equals(archiveToCompare.identifier);
    }
}
