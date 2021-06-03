
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.getSize()) {
            return true;
        }
        
        return false;
    }
    
    public int getSize() {
        return this.squares;
    }
    
    public int getPrice() {
        return this.squares * this.princePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.getPrice()-compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.getPrice() > compared.getPrice();
    }

}
