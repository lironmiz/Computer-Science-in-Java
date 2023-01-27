//*******************************************************
// SongsRepository.java
// the class reprsents SongsRepository
// Author: liron mizrahi
//*******************************************************
import java.util.Arrays;
public class SongsRepository
{
    public enum eAddSongStatus 
    {
        Success, SongAlreadyExist, WriterDoesntExist, PerformerDoesntExist
    };

    private Artist[] _allArtists;
    private int _numOfArtists;
    private Song[] _allSongs;
    private int _numOfSongs;
    /**
     * constractor of the class SongsRepository
     * @param: None
     * @return: None
     */
    public SongsRepository()
    {
        _allArtists = new Artist[2];
        _numOfArtists = 0;

        _allSongs = new Song[2];
        _numOfSongs = 0;
    }// end of method SongsRepository
    /**
     * method return the artist object with given name if the artist exists
     * @param: String name 
     * @return: Artist
     */
    public Artist getArtistByName(String name)
    {
        for (int i = 0; i < _numOfArtists; i++)
        {
            if (_allArtists[i].getName().equals(name))
            {
                return _allArtists[i];
            }
        }
        return null;
    }// end of method getArtistByName
    /**
     * method return the song by the name by the name of the song 
     * @param: String name 
     * @return: Artist
     */
    public Song getSongByName(String name)
    {
        for (int i = 0; i < _numOfSongs; i++)
        {
            if (_allSongs[i].getName().equals(name))
            {
               return _allSongs[i]; 
            }   
        }
        return null;
    }// end of method getSongByName
    /**
     * method return true if the method add artist to allArtists list  
     * @param: String name 
     * @return: boolean
     */
    public boolean addArtist(String name)
    {
        Artist temp = getArtistByName(name);
        if (temp == null)
        {
            if (_numOfArtists == _allArtists.length)
            {
                _allArtists = Arrays.copyOf(_allArtists, _allArtists.length*2);
            }
            _allArtists[_numOfArtists++] = new Artist(name);
            return true;
        }
        return false;
    }// end of method addArtist
    /**
     * method update the status of the song   
     * @param: String songName, String writerName, String performerName 
     * @return: eAddSongStatus
     */
    public eAddSongStatus addSong(String songName, String writerName, String performerName)
    {
        Song temp = getSongByName(songName);
        if (temp != null)
        {
            return eAddSongStatus.SongAlreadyExist;
        }
        Artist writer = getArtistByName(writerName);
        if (writer == null)
        {
            return eAddSongStatus.WriterDoesntExist;
        }
        Artist performer = null;
        if (!performerName.equals(""))
        {
            performer = getArtistByName(performerName);
            if (performer == null)
            {
               return eAddSongStatus.PerformerDoesntExist; 
            } 
        }

        if (_numOfSongs == _allSongs.length)
        {
            _allSongs = Arrays.copyOf(_allSongs, _allSongs.length * 2);
        }

        _allSongs[_numOfSongs] = new Song(songName, writer, performer);

        writer.addWrittenSong(_allSongs[_numOfSongs]);

        if (performer != null)
        {
            performer.addPerformedSong(_allSongs[_numOfSongs]);
        }
        _numOfSongs++;
        return eAddSongStatus.Success;
    }// end of method addSong
    /**
     * method return the data of the song as string 
     * @param: None
     * @return: String
     */
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer("The artists in the repository:\n");
        for (int i = 0; i < _numOfArtists; i++)
        {
            sb.append(_allArtists[i].toString() + "\n");
        }
        sb.append("The songs in the repository:\n");
        for (int i = 0; i < _numOfSongs; i++)
        {
            sb.append(_allSongs[i].toString() + "\n");
        }
        return sb.toString();
    }// end of method toString
}// end of class SongsRepository
