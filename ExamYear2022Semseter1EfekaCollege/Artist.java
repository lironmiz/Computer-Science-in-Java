//*******************************************************
// Artist.java
// the class reprsents Artist
// Author: liron mizrahi
//*******************************************************
import java.util.Arrays;
public class Artist 
{	
    private String _name;
    private Song[] _writtenSongs;
    private Song[] _performedSongs;
    /**
     * constractor of the class Artist
     * @param: String name
     * @return: None
     */
    public Artist(String name)
    {
        _name = name;
        _writtenSongs = new Song[0];
        _performedSongs = new Song[0];
    }// end of method Artist
    /**
     * method return the name of the artist
     * @param: String name
     * @return: String
     */
    public String getName()
    {
        return _name;
    }// end of method getName
    /**
     * method return returns true if the artists already has a song 
     * @param: Song theSong
     * @return: boolean 
     */
    public boolean hasWroteSong(Song theSong)
    {
        for(int i = 0; i < _writtenSongs.length; i++)
        {
            if(_writtenSongs[i].getName() == theSong.getName())
            {
                return true;
            }
        }
        return false;
    }// end of method hasWroteSong
    /**
     * method return true if she add given song to writtenSong list 
     * @param: Song newSong
     * @return: boolean 
     */
    public boolean addWrittenSong(Song newSong)
    {
        return false;
    }// end of method addWrittenSong
    /**
     * method return true if she add performed song to the performedSongs list 
     * @param: Song newsSong
     * @return: boolean 
     */
    public boolean addPerformedSong(Song newSong)
    {
        if (hasPerformedSong(newSong))
        {
            return false;
        }

        _performedSongs = Arrays.copyOf(_performedSongs, _performedSongs.length+1);
        _performedSongs[_performedSongs.length-1] = newSong;
        newSong.setLastPerformer(this);
        return true;
    }// end of method addPerformedSong
    /**
     * method return true if given song is exists in the performedSongs list 
     * @param: Song theSong
     * @return: boolean 
     */
    public boolean hasPerformedSong(Song theSong)
    {
        for (int i=0 ; i < _performedSongs.length ; i++)
        {
            if (_performedSongs[i].getName().equals(theSong.getName()))
            {
                return true;
            }
        }
        return false;
    }// end of method hasPerformedSong
    @Override
    /**
     * method return Artists data as string 
     * @param: None
     * @return: String 
     */
    public String toString()
    {
        StringBuffer sb = new StringBuffer("The artist " + _name + " wrote "  + _writtenSongs.length + " songs:\n");
        for (int i=0 ; i < _writtenSongs.length; i++)
        {
            sb.append("\t" + _writtenSongs[i].getName()+ "\n");
        } 
        sb.append("and performed these songs: \n");
        for (int i=0 ; i < _performedSongs.length; i ++)
        {
            sb.append("\t" + _performedSongs[i].getName()+ "\n");
        }   
        return sb.toString();
    }// end of method toString
}// end of class Artist
