
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int totalPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.totalPrice = this.squareMeters*this.pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters>otherApartment.squareMeters? true:false;
    }

    public int priceDifference(Apartment otherApartment){
        int diff = this.totalPrice-otherApartment.totalPrice;
        return diff>0?diff:-diff;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.totalPrice>otherApartment.totalPrice;
    }
}
