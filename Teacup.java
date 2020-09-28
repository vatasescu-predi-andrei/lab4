public class Teacup extends Product {
    private int volumeOfTea;

    /**
     * This constructor creates a teacup object and makes use of the price and numStock in the super class
     * @param volumeOfTea
     * @param price
     * @param numStock
     */
    Teacup(int volumeOfTea,double price, int numStock){
        super(price, numStock);
        this.volumeOfTea=volumeOfTea;
    }

    /**
     * This method gets the Volume of Tea
     * @return the actual volume of tea that a teacup has
     */
    public int getvolumeOfTea(){
        return volumeOfTea;
    }

    /**
     * This method sets the volume of tea
     * @param volumeOfTea the volume of tea that I want a teacup to have
     */
    public void setVolumeOfTea(int volumeOfTea){
        this.volumeOfTea=volumeOfTea;
    }
}
