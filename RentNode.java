 

public class RentNode{
    private Rent _rent;
    private RentNode _next;
    
    public RentNode (Rent r){
        this._rent = new Rent(r);
        this._next = null;
    }
    
    public RentNode (Rent r, RentNode next){
            this._rent = new Rent(r);
            this._next = next;
    }
    
    public RentNode(RentNode other){
        this._rent = new Rent(other._rent);
        this._next = other._next;
        // maybe ment this._next = other._next ???
    }
    
    public Rent getRent(){
        return new Rent(_rent);
    }
    
    public RentNode getNext(){
        return _next;
    }
    
    public void setRent(Rent r){
        _rent = new Rent(r);
    }
    
    public void setNext(RentNode next){
        _next = next;
    }
    public static void main( String[] args ) throws Exception {
        //System.out.println((getClassFromFile("ClassFile")));
    }
}
