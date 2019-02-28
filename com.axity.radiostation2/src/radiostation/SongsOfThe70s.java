/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author EeveeKat
 */
public class SongsOfThe70s implements SongIterator {
    ArrayList<SongInfo> bestSongs;
    
    public SongsOfThe70s(){
        bestSongs = new ArrayList<SongInfo>();
        
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }
    
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }
    
    public Iterator createIterator() {
	return bestSongs.iterator();
    }
}
