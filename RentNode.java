/**
 * RentNode.java
 * the class represent a RentNode
 * @author (liron mizrhai)
 * @Date (1/20/2023)
 */
public class RentNode
{
    private Rent _rent;
    private RentNode _next;
    
    /**
    * constuctor of the class RentNode
    * @parm Rent r
    * @return None
    */
    public RentNode (Rent r)
    {
        _rent = new Rent(r);
        _next = null;
    }// end of method RentNode
    
    /**
    * constuctor of the class RentNode
    * @parm Rent r, RentNode next
    * @return None
    */
    public RentNode (Rent r, RentNode next)
    {
            this._rent = new Rent(r);
            this._next = next;
    }// end of method RentNode
    /**
    * copy constuctor of the class RentNode
    * @parm RentNode other
    * @return None
    */
    public RentNode(RentNode other)
    {
        _rent = other._rent;
        _next = other._next;
    }// end of method RentNode
    /**
    * method return the rent
    * @parm None
    * @return Rent
    */
    public Rent getRent()
    {
        return new Rent(_rent);
    }// end of method getRent
    /**
    * method return the getNext
    * @parm None
    * @return _next
    */
    public RentNode getNext()
    {
        return _next;
    }// end of method getNext
    /**
    * method set the _rent to given rent
    * @parm Rent r
    * @return None
    */
    public void setRent(Rent r)
    {
        _rent = new Rent(r);
    }// end of method setRent
    /**
    * method set the _next to given RentNode
    * @parm RentNode next
    * @return None
    */
    public void setNext(RentNode next)
    {
        _next = next;
    }// end of method setNext
}// end of class RentNode
