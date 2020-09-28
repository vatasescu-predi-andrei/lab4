public class cd extends Playable {
    private String artist;

    /**
     * This constructor builds a cd type object and makes use of the variables in supperclass Playable
     * @param price
     * @param numStock
     * @param runtime
     * @param title
     * @param artist
     */
    public cd (double price, int numStock, double runtime, String title,String artist){
        super(price, numStock,runtime,title);
        this.artist=artist;
    }

    /**
     * This method gets the name of the Artist
     * @return the name of the artist
     */
    public String getArtist(){
        return artist;
        }

    /**
     * This method sets the name of the artist of a CD
     * @param artist name of the artist
     */
    public void setArtist(String artist){
        this.artist=artist;
        }

    /**
     * This method overrides the abstract method in Playable class because a CD playes a SONG
     */
    @Override
    public void play() {
        System.out.println("A song is played now");

    }
    }


