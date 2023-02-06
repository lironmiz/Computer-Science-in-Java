
public class Message
{
    private String _sender, _subject, _content;
    private Date _dateReceived;
     /**
     * constructor of the class Message
     * @param: String sender, String subject, String content, Date date
     * @return: None
     */
    public Message(String sender, String subject, String content, Date date)
    {
        _sender = sender;
        _subject = subject;
        _content = content;
        _dateReceived = date;
    }// end of method Message
    /**
     * copy constructor of the class Message
     * @param: Message m
     * @return: None
     */
    public Message(Message m)
    {
        _sender = m._sender;
        _subject =  m._subject;
        _content = m._content;
        _dateReceived = new Date(m._dateReceived.getDay(), m._dateReceived.getMonth(), m._dateReceived.getYear());
    }// end of method Message
    /**
     * methed return the sender of the message
     * @param: None
     * @return: String
     */
    public String getSender()
    {
        return _sender;
    }// end of method getSender
    /**
     * methed return the subject of the message
     * @param: None
     * @return: String
     */
    public String getSubject()
    {
        return _subject;
    }// end of method getSubject
    /**
     * methed return the content of the message
     * @param: None
     * @return: String
     */
    public String getContent()
    {
        return _content;
    }// end of method getContent
    /**
     * methed return  date of the message 
     * @param: None
     * @return: String
     */
    public Date getRecDate()
    {
        return new Date(_dateReceived);
    }// end of method getRecDate
    /**
     * methed return true if the address is valid
     * @param: None
     * @return: boolean
     */
    public boolean isValidAddress()
    {
        return _sender.contains("@");
    }// end of method isValidAddress
    /**
     * methed return the number of words in the message content 
     * @param: None
     * @return: int
     */
    public int howManyWords()
    {
        return _content.length();
    }// end of method howManyWords
    /**
     * methed return the number of words in the message content 
     * @param: Message
     * @return: boolean
     */
    public boolean wasReceivedEarlier(Message other)
    {
        return other.getRecDate().before(this.getRecDate());
    }// end of method wasReceivedEarlier
}// end of class Message
