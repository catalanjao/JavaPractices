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
public class RadioStation {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        
        DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);

        madMike.showTheSongs2();

    }
    
}
