/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pete
 */
public class Cube {
    
    private int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }
    
    public int getEdgeLength() {
        return this.edgeLength;
    }
    
    public String toString() {
        return "The length of edge is "+getEdgeLength()+" and the volume is "+volume();
    }
    
}
