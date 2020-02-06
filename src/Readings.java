public abstract class Readings
{
    protected int pages;
    protected String author;
    protected String publisher;
    protected String name;

    public Readings(String name, int pages, String author, String publisher)
    {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }//end constructor

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAuthor: " + author;
        output += "\nPublisher: " + publisher;
        output += "\nNumber of pages: " + pages;
        return output;
    }//end toStirng
}//end readings
