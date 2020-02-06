public class Comic extends Readings
{
    private String artist;
    private boolean goodArt;
    private String genre;

    public Comic(String name, int pages, String author, String publisher, String genre, String artist, boolean goodArt)
    {
        super(name, pages, author, publisher);
        this.artist = artist;
        this.goodArt = goodArt;
        this.genre = genre;
    }//end constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nArtist: " + artist;
        output += "\nGood Art: " + goodArt;
        output += "\nGenre: " + genre + "\n";
        return output;
    }//end toString
}//end class comics
