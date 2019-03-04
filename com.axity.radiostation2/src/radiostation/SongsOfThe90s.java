/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author EeveeKat
 */
public class SongsOfThe90s implements SongIterator {
    
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int hashKey = 0;
	
	public SongsOfThe90s() {
            addSong("Losing My Religion", "REM", 1991);
            addSong("Creep", "Radiohead", 1993);
            addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
	}
		
	public void addSong(String songName, String bandName, int yearReleased){
            SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
            bestSongs.put(hashKey, songInfo);
            hashKey++;		
	}
	
	public Iterator createIterator() {
            return bestSongs.values().iterator();
        }
}
