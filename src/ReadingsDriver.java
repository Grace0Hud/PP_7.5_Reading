public class ReadingsDriver
{
    public static void main(String [] args)
    {
        Readings oathbreaker = new Novel("Oathbreaker", 10000, "Brandon Sanderson", "unkown", "fantasy", 4.7, 3, false);
        Readings ensign = new Magazine("Ensign", 40, "Various", "Church of Jesus Christ of Latter Day Saints", 7, "religous", true);
        Readings unordinary = new Comic("Unordinary", 400, "Unichan", "Webtoon", "superhero", "Unichan", true);

        Readings[] readingList = new Readings[3];
        readingList[0] = oathbreaker;
        readingList[1] = ensign;
        readingList[2] = unordinary;

        for(int i = 0; i < readingList.length; i++)
        {
            System.out.println(readingList[i]);
        }//end for
    }//end main method
}//end ReadingsDriver
