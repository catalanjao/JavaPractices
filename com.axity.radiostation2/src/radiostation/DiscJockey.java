/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author EeveeKat
 */
public class DiscJockey {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;
    
    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;
    
    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;
    }
    
    public void showTheSongs2(){
        System.out.println("NEW WAY WITH ITERATOR\n");

        Iterator Songs70s = iter70sSongs.createIterator();
        Iterator Songs80s = iter80sSongs.createIterator();
        Iterator Songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);
    }

	public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");

        }

    }
}
