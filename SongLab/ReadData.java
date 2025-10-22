package SongLab;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData
{
    public Song[] read()
    { 
         Scanner in; 
         Song [] songs = new Song[28371];
       try{
        
    
            int count = 1;
        in = new Scanner(new File("songs 2025-2026 ANSI.csv"));
        in.nextLine();
               while(in.hasNext()){
                String line = in.nextLine();
                int year = Integer.parseInt(line.split(";")[2]);
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shakeability = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs[count] = new Song(artist, title, year, genre, length, shakeability, obscene, danceability, loudness, topic);
                count++;
               }
    
           
    
    in.close();
}   
    catch(Exception e)
    {
        System.out.println(e); }
    }
    public String getLongestTitle (Song [] list)
    {
        String title = "";

        for(int i = 0; i < 28372; i++)
        {
            String newTitle = list[i].getTitle();
            if(newTitle.length() > title.length())
            {
                title = newTitle;
            }
        }
        return title;
    
}
}
