import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
//*******************************************************
// Deck.java
// the class reprsents Deck
// Author: liron mizrahi
//*******************************************************
public class Deck
{ 
    public final static int MAX_NUM_OF_CARD = 40;
    public Card[] _cardArray;
    public int _leftCard;
    /**
     * constractor of the class Card 
     * @parm: None 
     * @return: None
     */
    public Deck()
    {
        _cardArray = new Card[MAX_NUM_OF_CARD];
        _leftCard = 0;
        
        Card._type[] allTypes = Card._type.values();
        for(int i = 1; i <= Card.FINAL_VALUE_FOR_CARD; i++)
        {
            for(Card._type t : allTypes)
            {
                _cardArray[_leftCard++] = new Card(i, t);
            }
        }
        shuffle();
    }// end of method Deck
    /**
     * constractor of the class Card 
     * @parm: String fileName 
     * @return: 
     */
    public Deck(String fileName) throws FileNotFoundException
    {
        Scanner s = new Scanner(new File(fileName));
        _leftCard = s.nextInt();
        _cardArray = new Card[_leftCard];
        for(int i = 0; i < _cardArray.length; i++)
        {
            _cardArray[i] = new Card(s);
        }
        
        s.close();
    }// end of method Deck
    /**
    * the method save the number of left cards and the data of the cards to file given as paramter
    * @parm: String file
    * @return: None
    */
    public void save(String file) throws FileNotFoundException
    {
        File f = new File(file);
        PrintWriter pw = new PrintWriter(f);
        
        pw.println(_leftCard);
        for(int i = 0; i < _leftCard; i++)
        {
            _cardArray[i].save(pw);
        }
        pw.close();
    }// end of method save 
    /**
    * the method shuffles the cards in the Deck of cards
    * @parm: None
    * @return: None
    */
    public void shuffle()
    {
        for(int i = 0; i < _cardArray.length; i++)
        {
            int rand1 = (int) (Math.random() * _cardArray.length);
            int rand2 = (int) (Math.random() * _cardArray.length);
            Card temp = _cardArray[rand1];
            _cardArray[rand1] = _cardArray[rand2];
            _cardArray[rand2] = temp;
        }
    }// end of method shuffle
    /**
    * the method return the num of cards left in the deck
    * @parm: None
    * @return: int 
    */
    public int cardsLeft()
    {
        return _leftCard;
    }// end of method cardsLeft
    /**
    * the method return the last card in card array and remove him
    * @parm: None
    * @return: Card 
    */
    public Card dealTopCard()
    {
        return _cardArray[--_leftCard];
    }// end of method dealTopCard
    /**
    * the method return the last card in card array and not remove him 
    * @parm: None
    * @return: Card 
    */
    public Card peekTopCard()
    {
        return _cardArray[_leftCard - 1];
    }// peekTopCard
    /**
    * the method return the data of the deck as string 
    * @parm: None
    * @return: String 
    */
    public String toString()
    {
        StringBuffer str = new StringBuffer("[" + _leftCard +" -");
        for(int i=_leftCard - 1; i >= 0; i--)
        {
            str.append(_cardArray[i].toString() + ", ");
        }
        str.append("]");
        return str.toString();
    }// end of method toString
}// end of method Deck
