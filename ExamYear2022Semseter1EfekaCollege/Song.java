//*******************************************************
// Song.java
// the class reprsents Song
// Author: liron mizrahi
//*******************************************************
public class Song
{
    private String _name;
    private Artist _writer;
    private Artist _lastPerformer;
    /**
     * constractor of the class Song
     * @param: String name, Artist writer, Artist lastPerformer
     * @return: None
     */
    public Song(String name, Artist writer, Artist lastPerformer)
    {
        _name = name;
        _writer = writer;
        _writer.addWrittenSong(this);

        _lastPerformer = lastPerformer;

        if (_lastPerformer != null)
        {
            _lastPerformer.addPerformedSong(this);
        }
    }// end of method Song
    /**
     * constractor set the last performer 
     * @param: Artist lastPerformer
     * @return: None
     */
    public void setLastPerformer(Artist lastPerformer)
    {
        if (lastPerformer!= null && _lastPerformer != lastPerformer)
        {
            _lastPerformer = lastPerformer;
            _lastPerformer.addPerformedSong(this);
        }
    }// end of method setLastPerformer
    /**
     * method get the name of the song 
     * @param: None
     * @return: String
     */
    public String getName()
    {
        return _name;
    }// end of method getName
    /**
     * method return the data of the song as string 
     * @param: None
     * @return: String
     */
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer("The song '" + _name + "' was written by " + _writer.getName());
        if (_lastPerformer != null)
        {
            sb.append(" and was last performed by " + _lastPerformer.getName());
        }
        return sb.toString();
    }// end of method toString
}// end of class toString
