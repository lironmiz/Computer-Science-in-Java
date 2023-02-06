/**
 * Date.java
 * The class reprsents date
 * Author liron mizrahi
 */
public class mmn13JavaAYear2009Driver
{
    public static void main(String [] args)
    {
        Passport passport1 = new Passport("Moshe Cohen", 306914, new Date(12,10,2003));
        Passport passport2 = new Passport("Lila Cohen ", 306915, new Date(14,10,2003));
        Date travelDate = new Date(13,10,2003);
        Traveler t1 = new Traveler(passport1,true);
        Traveler t2 = new Traveler(passport2,true);
        if(t1.checkTravel(travelDate))
        {
            System.out.println(t1);
        }
        if(t2.checkTravel(travelDate))
        {
            System.out.println(t2);
        }
    } // end of method main
}// end of class mmn13JavaAYear2009Driver
