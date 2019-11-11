import java.lang.*;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;

    }

    public boolean larger(Apartment otherApartment) {
        if (this.rooms > otherApartment.rooms) {
            return true;
        }
        if (this.rooms == otherApartment.rooms && this.pricePerSquareMeter > otherApartment.pricePerSquareMeter) {
            return true;
        }
        if (this.rooms == otherApartment.rooms && this.pricePerSquareMeter == otherApartment.pricePerSquareMeter
                && this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int price() {
        return this.price = this.pricePerSquareMeter * this.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.price() - otherApartment.price());
    }
}