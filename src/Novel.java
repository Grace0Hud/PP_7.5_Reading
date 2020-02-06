public class Novel extends Readings
{
    private String genre;
    private double reviews;//1-5 stars
    private int numInSeries;
    private boolean finished;

    public Novel(String name, int pages, String author, String publisher, String genre, double reviews, int numInSeries, boolean finished)
    {
        super(name, pages, author, publisher);
        this.genre = genre;
        this.reviews = reviews;
        this.numInSeries = numInSeries;
        this.finished = finished;
    }//end novel constructor

    public String toString()
    {
        String output = super.toString();
        output += "\nGenre: " + genre;
        output += "\nReviews: " + reviews;
        output += "\nNumber of OTHER books in series: " + (numInSeries - 1);
        output += "\nSeries finished: " + finished + "\n";
        return output;
    }//end of toString
}//end of novel class
