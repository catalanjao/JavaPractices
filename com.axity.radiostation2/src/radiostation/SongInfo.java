/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation;

/**
 *
 * @author EeveeKat
 */
public class SongInfo {
    String songName; 
	String bandName; 
	int yearReleased;
	
	public SongInfo(String newSongName, String newBandName, int newYearReleased){
		
		songName = newSongName;
		bandName = newBandName;
		yearReleased = newYearReleased;
		
	}
	
	public String getSongName(){ return songName; }
	public String getBandName(){ return bandName; }
	public int getYearReleased(){ return yearReleased; }
	
}