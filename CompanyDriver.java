/**
 * CompanyDriver.java
 * the class have test for company class
 * @author (liron mizrhai)
 * @Date (1/7/2023)
 */
public class CompanyDriver
{
    /**
     * Created by: Liron Mizrhai
     * you need to have this class in the same project Date, Car, Rent, Company
     * required Methods you need to add this if you want the tester to work :
     * 
     * public int getNumOfRents()
     * {
     *  return _noOfRents;
     * }
     * 
     * public Rent[] getRents()
     * {
     *        return _rents;
     * }
     * 
     * *** IMPORTANT! ***
     *  after using the tester remove the methods before submitting
     * 
     */
    private static int testNum = 0;

    public static void main(String[] args)
    {
        System.out.println(" --Company Tester--");
        Date date1 = new Date(1, 1, 2000);
        Date date2 = new Date(6, 1, 2000);
        Date date3 = new Date(8, 1, 2000);
        Date date4 = new Date(10, 1, 2000);
        Date date5 = new Date(16, 1, 2000);
        Date date6 = new Date(20, 1, 2000);
        Date date7 = new Date(22, 1, 2000);
        Date date8 = new Date(25, 1, 2000);
        Date date9 = new Date(29, 1, 2000);
        Date date10 = new Date(3, 2, 2000);
        Date date11 = new Date(10, 2, 2000);
        Date date12 = new Date(20, 2, 2000);
        Car carA = new Car(1234567, 'A', "Ford", false);
        Car carB = new Car(1234567, 'B', "Ford", false);
        Car carC = new Car(1234567, 'C', "Ford", false);
        Car carD = new Car(1234567, 'D', "Ford", false);
        Rent r1 = new Rent("Rent 1", carA, date1, date2);
        Rent r2 = new Rent("Rent 2", carB, date2, date3);
        Rent r3 = new Rent("Rent 3", carC, date3, date4);
        Rent r4 = new Rent("Rent 4", carC, date4, date5);
        Rent r5 = new Rent("Rent 5", carC, date5, date6);
        Rent r6 = new Rent("Rent 6", carC, date6, date7);
        Rent r7 = new Rent("Rent 7", carC, date7, date8);
        Rent r8 = new Rent("Rent 8", carC, date8, date9);
        Rent r10 = new Rent("Rent 10", carC, date10, date11);
        Rent r11 = new Rent("Rent 11", carD, date11, date12);
        String toStringTest = "The company has 11 rents:\n" +
            "Name:Rent 1 From:01/01/2000 To:06/01/2000 Type:A Days:5 Price:500\n" +
            "Name:Rent 2 From:06/01/2000 To:08/01/2000 Type:B Days:2 Price:300\n" +
            "Name:Rent 3 From:08/01/2000 To:10/01/2000 Type:C Days:2 Price:360\n" +
            "Name:Rent 4 From:10/01/2000 To:16/01/2000 Type:C Days:6 Price:1080\n" +
            "Name:Rent 5 From:16/01/2000 To:20/01/2000 Type:C Days:4 Price:720\n" +
            "Name:Rent 6 From:20/01/2000 To:22/01/2000 Type:C Days:2 Price:360\n" +
            "Name:Rent 7 From:22/01/2000 To:25/01/2000 Type:C Days:3 Price:540\n" +
            "Name:Rent 8 From:25/01/2000 To:29/01/2000 Type:C Days:4 Price:720\n" +
            "Name:Rent 9 From:29/01/2000 To:03/02/2000 Type:C Days:5 Price:900\n" +
            "Name:Rent 10 From:03/02/2000 To:10/02/2000 Type:C Days:7 Price:1134\n" +
            "Name:Rent 11 From:10/02/2000 To:20/02/2000 Type:D Days:10 Price:2232";
        System.out.println("---Testing Constructor---");
        Company c = new Company();
        Company c1 = new Company();
        test(c.getNumOfRents() == 0);
        test(c.getRents().length == 1000);
        c.addRent("Rent 8", carC, date8, date9);
        c.addRent("Rent 7", carC, date7, date8);
        c.addRent("Rent 6", carC, date6, date7);
        c.addRent("Rent 5", carC, date5, date6);
        c.addRent("Rent 4", carC, date4, date5);
        c.addRent("Rent 3", carC, date3, date4);
        c.addRent("Rent 2", carB, date2, date3);
        c.addRent("Rent 1", carA, date1, date2);
        System.out.println("---Testing addRent---");
        test(c.getRents()[0].equals(r1));
        test(c.getRents()[1].equals(r2));
        test(c.getRents()[2].equals(r3));
        test(c.getRents()[3].equals(r4));
        test(c.getRents()[4].equals(r5));
        test(c.getRents()[5].equals(r6));
        test(c.getRents()[6].equals(r7));
        test(c.getRents()[7].equals(r8));
        test(c.getRents()[8] == null);
        System.out.println("---Testing removeRent---");
        test(c.removeRent(date2));
        test(!c.removeRent(date2));
        test(!c1.removeRent(date12));
        test(c.getRents()[0].equals(r2));
        test(c.getRents()[1].equals(r3));
        test(c.getRents()[2].equals(r4));
        test(c.getRents()[3].equals(r5));
        test(c.getRents()[4].equals(r6));
        test(c.getRents()[5].equals(r7));
        test(c.getRents()[6].equals(r8));
        test(c.removeRent(date9));
        test(!c.removeRent(date9));
        test(c.getRents()[6] == null);
        System.out.println("---Testing getSumOfPrices---");
        test(c1.getSumOfPrices() == 0);
        c.addRent("Rent 8", carC, date8, date9);
        c.addRent("Rent 1", carA, date1, date2);
        test(c.getSumOfPrices() == 4580);
        System.out.println("---Testing getSumOfDays---");
        c.removeRent(date2);
        c.removeRent(date9);
        test(c.getSumOfDays() == 19);
        test(c1.getSumOfDays() == 0);
        c.addRent("Rent 8", carC, date8, date9);
        c.addRent("Rent 1", carA, date1, date2);
        test(c.getSumOfDays() == 28);
        System.out.println("---Testing averageRent---");
        test(c1.averageRent() == 0);
        test(c.averageRent() == 3.5);
        c.addRent("Rent 9", carC, date9, date10);
        test(c.averageRent() == 3.6666666666666665);
        c.addRent("Rent 10", carC, date10, date11);
        test(c.averageRent() == 4.0);
        c.addRent("Rent 11", carD, date11, date12);
        test(c.averageRent() == 4.545454545454546);
        System.out.println("---Testing lastCarRent---");
        test(c1.lastCarRent() == null);
        test(c.lastCarRent().equals(carD));
        c.removeRent(date12);
        test(c.lastCarRent().equals(carC));
        c.addRent("Rent 11", carD, date11, date12);
        System.out.println("---Testing longestRent---");
        test(c1.longestRent() == null);
        test(c.longestRent().equals(r11));
        c.removeRent(date12);
        test(c.longestRent().equals(r10));
        c.addRent("Rent 11", carD, date11, date12);
        System.out.println("---Testing mostCommonRate---");
        test(c.mostCommonRate() == 'C');
        c1.addRent("Rent 12", carD, date11, date12);
        test(c1.mostCommonRate() == 'D');
        c1.addRent("Rent 13", carA, date11, date12);
        c1.addRent("Rent 14", carA, date11, date12);
        c1.addRent("Rent 16", carA, date11, date12);
        test(c1.mostCommonRate() == 'A');
        c1.addRent("Rent 13", carB, date11, date12);
        c1.addRent("Rent 14", carB, date11, date12);
        c1.addRent("Rent 16", carB, date11, date12);
        test(c1.mostCommonRate() == 'B'); // B > A
        System.out.println("---Testing toString---");
        c1.removeRent(date12);
        c1.removeRent(date12);
        c1.removeRent(date12);
        c1.removeRent(date12);
        c1.removeRent(date12);
        c1.removeRent(date12);
        c1.removeRent(date12);
        test(c1.toString() == "The company has 0 rents.");
        test(c.toString().equals(toStringTest));

    }// end of method main 

    private static void test(boolean testCondition)
    {
        String msg;
        if (testCondition)
        {
            msg = "PASS";
        } 
        else
        {
            msg = "ERROR";
        }
        System.out.println("TestNum: " + (++testNum) + " " + msg);
    }// end of method test
}// end of class CompanyDriver
