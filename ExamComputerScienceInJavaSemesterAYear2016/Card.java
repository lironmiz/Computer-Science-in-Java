import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Scanner;
public class Card
{
    public final static int FINAL_VALUE_FOR_CARD = 10;
    private int _cardValue;
    public enum _typeOfCard{SPADES,HEARTS,DIAMONDS,CLUBS};
    public static _typeOfCard _type;
    /**
     * constractor of the class Card 
     * @parm: int cardValue, _typeOfCard type
     * @return: None
     */
    public Card(int cardValue, _typeOfCard type)
    {
        _cardValue = cardValue;
        if( cardValue >= 1 && cardValue <= 10)
        {
            _cardValue = cardValue;
        }
        else 
        {
             _cardValue = 1;
        }
    }// end of method Card 
    /**
     * constractor of the class Card 
     * @parm: int cardValue, _typeOfCard type
     * @return: None
     */
    public Card(Scanner s)
    {
          this(s.nextInt(), _typeOfCard.valueOf(s.next()));  
    }// end of method Card 
    /**
     * the method get printWriter object and write to him the value of the card and the sign on him
     * @parm: PrintWriter pw
     * @return: None
     */
    public void save(PrintWriter pw)
    {
        pw.println(_cardValue);
        pw.println(_type.name());
    }// end of method save 
    /**
     * the method 
     * @parm: PrintWriter pw
     * @return: None
     */
    public boolean isHigher(Card card)
    {
        if(_cardValue > card._cardValue)
        {
            return true;
        }
        else if(_cardValue < card._cardValue)
        {
            return false;
        }
        else
        {
            return _type.ordinal() > card._type.ordinal();
        }
    }// end of method isHigher
    /**
     * the method return string with object data
     * @parm: None
     * @return: String
     */
    public String toString()
    {
        return "card value: " + _cardValue + " type of card: " + _type;
    }// end of method toString
}// end of class Card 
