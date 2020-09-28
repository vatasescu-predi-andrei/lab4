public class DVD extends Playable {
    private String director;

    /**
     * This constructer builds an object of DVD type that makes use of the price,numstock,runtime, and title of the
     * supperclass Playable
     * @param price
     * @param numStock
     * @param runtime
     * @param title
     * @param director
     */
    public DVD(double price, int numStock, double runtime, String title,String director){
        super(price, numStock,runtime,title);
        this.director=director;
    }

    /**
     * This method gets the Director of the DVD
     * @return the name of the Director
     */
    public String getDirector(){
        return director;
    }

    /**
     * This method sets the Director of the DVD
     * @param director the name of the Director
     */
    public void setDirector(String director){
        this.director=director;
    }

    /**
     * This method overrides the abstract method play in Playable
     * It prints that a movie is played
     */
    @Override
    public void play() {
        System.out.println( "A movie is played now");

    }

    /**
     * This method overrides the abstract method get rental cost in Playable
     *@return a different price of the DVD, because it is bigger than a normal playable media
     */
    @Override
    public double getRentalCost() {
        return (super.getRentalCost()+0.20);
    }
}
