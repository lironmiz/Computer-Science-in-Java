//*******************************************************
// ChocolateDriver.java
// the class reprsents a tester for the Chocolate class
// Author: liron mizrahi
//*******************************************************
public class ChocolateDriver
{
    public static void main(String[] args)
    {
        // 1
        Chocolate choco1 = new Chocolate("wowChocolate", 5, 120, 10);
        Chocolate choco2 = new Chocolate("ourChocolate", 6, 160, 15);
        Chocolate choco3 = new Chocolate("iWantChocolate", 4, 20, 30);
        // 2
        System.out.print(choco1.toString() + " choco2: " + choco2.toString() + " choco3: " + choco3.toString());
        // 3
        double newPrice1 = choco1.getPrice() * 1.1;
        choco1.setPrice(newPrice1);
        double newPrice2 = choco2.getPrice() * 1.1;
        choco2.setPrice(newPrice2);
        double newPrice3 = choco3.getPrice() * 1.1;
        choco3.setPrice(newPrice3);
        // 4
        choco3.setCubes(choco3.getCubes() + 20);
        // 5
        System.out.println(choco2.getManufacturer());
        // 6
        System.out.print(choco3.toString() + " choco2: " + choco2.toString() + " choco1: " + choco1.toString());
        // 7
        System.out.print(choco3.toString());
        // 8
        Chocolate choco4 = new Chocolate(choco1);
    }
}// end of class ChocolateDriver 
