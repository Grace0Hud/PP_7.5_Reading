public class Magazine extends Readings
{
    private int numArticles;
    private String genre;
    private boolean trustworthy;

    public Magazine(String name, int pages, String author, String publisher, int numArticles, String genre, boolean trustworthy)
    {
        super(name, pages, author, publisher);
        this.numArticles = numArticles;
        this.genre = genre;
        this.trustworthy = trustworthy;
    }//end magazines

    public String toString()
    {
        String output = super.toString();
        output += "\nnumber of Articles: " + numArticles;
        output += "\nGenre: " + genre;
        output += "\nTrustworthy: " + trustworthy + "\n";
        return output;
    }//end toString

}//end of magazines class
