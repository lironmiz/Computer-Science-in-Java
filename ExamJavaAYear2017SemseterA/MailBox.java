
public class MailBox
{
    final int MAX_MESSAGES = 20;
    
    private int _numOfMes;
    private Message[] _inbox;
    /**
     * constructor of the class MailBox
     * @param: None
     * @return: None
     */
    public MailBox()
    {
        _numOfMes = 0;
        _inbox = new Message[MAX_MESSAGES];
    }// end of method MailBox
    /**
     * method add message to inbox 
     * @param: Message m
     * @return: boolean
     */
    public boolean addMessage(Message m)
    {
        return true;
    }// end of method addMessage
    /**
     * method return string contains all the subjects of all the message 
     * @param: Message m
     * @return: boolean
     */
    public String toString()
    {
        String str = "the messages subjects /n";
        for(int i = 0; i < _inbox.length; i++)
        {
            if(_inbox[i] instanceof Message)
            {
                str += _inbox[i].getSubject() + "/n";
            }
        }
        return str;
    }// end of method toString 
    /**
     * method return the number of messages recived in given month  
     * @param: int m
     * @return: int 
     */
    public int howManyMesInMonth(int m)
    {
        int count = 0;
        for(int i = 0; i < _inbox.length; i++)
        {
            if(_inbox[i] instanceof Message)
            {
                if(_inbox[i].getRecDate().getMonth() == m)
                {
                    count++;
                }
            }
        }
        return count;
    }// end of method howManyMesInMonth
    /**
     * method return the longest message from given sender  
     * @param: String sender
     * @return: Message
     */
    public Message longestMessageFromSender(String sender)
    {
        int longest = Integer.MIN_VALUE;
        int indexLongest = 0;
        for(int i = 0; i < _inbox.length; i++)
        {
            if(_inbox[i] instanceof Message)
            {
                if(_inbox[i].getSender().equals(sender))
                {
                    if(_inbox[i].howManyWords() > longest)
                    {
                        longest = _inbox[i].howManyWords();
                        indexLongest = i;
                    }
                }
            }
        }
        return _inbox[indexLongest];
    }// end of method longestMessageFromSender
    /**
     * method remove the oldest message 
     * @param: None
     * @return: None
     */
    public void removeOldestMessage()
    {
        Date oldest = new Date(_inbox[0].getRecDate());
        int indexOldest = 0;
        for(int i = 1; i < _inbox.length; i++)
        {
            if(_inbox[i] instanceof Message)
            {
                if(_inbox[i].getRecDate().before(oldest));
                {
                    oldest = new Date(_inbox[i].getRecDate());
                    indexOldest = i;
                }
            }
        }
        _inbox[indexOldest] = null;
        for(int j = indexOldest + 1; j < _inbox.length; j++)
        {
            if(_inbox[j] instanceof Message)
            {
                _inbox[j-1] = _inbox[j];
            }
            else
            {
                break;
            }
        }
    }// end of method removeOldestMessage
}// end of class MailBox
