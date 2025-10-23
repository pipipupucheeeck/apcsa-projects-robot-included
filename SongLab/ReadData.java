package SongLab;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadData {
    public Song[] read() {
        Scanner in;
        Song[] songs = new Song[28372];
        try {

            int count = 1;
            in = new Scanner(new File("SongLab/songs 2025-2026.csv"));
            in.nextLine();
            while (in.hasNext()) {
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

                songs[count] = new Song(artist, title, year, genre, length, shakeability, obscene, danceability,
                        loudness, topic);
                count++;
            }

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return songs;
    }

    public String getLongestTitle(Song[] list) {
        String longestTitle = "";

        for (int i = 1; i < 28372; i++) {
            String newTitle = list[i].getTitle();
            if (newTitle.length() > longestTitle.length()) {
                longestTitle = newTitle;
            }
        }
        return longestTitle;

    }
    public int filterByYear(Song [] list, int year)
    {
        int count=0;
        for (int i=1;i<28372;i++)
        {
            if (list[i].getYear()==year)
            {
                count++;
            }

        }
        return count;

    }
    public int FilterByDanceability(Song [] list, double danceabilityRequirement)
    {
        int count=0;
        for (int i=1;i<28372;i++)
        {
            if (list[i].getDanceability()>danceabilityRequirement)
            {
                count++;
            }
     
        }
        return count;

    }
    public int getLongestLen(Song[] list) {
        int len = 0;

        for (int i = 1; i < 28372; i++) {
            int newLen = list[i].getLength();
            if (newLen > len) {
                len = newLen;
            }
        }
        return len;

    }
    public double getLowestShakeability(Song[] list) {
        double shakeability = Double.MAX_VALUE;

        for (int i = 1; i < 28372; i++) {
            double newShakeability = list[i].getShakeability();
            if (newShakeability< shakeability) {
                shakeability = newShakeability;
            }
        }
        return shakeability;
    }
    public double getLoudestSong(Song[] list) {
        double loudness = 0;

        for (int i = 1; i < 28372; i++) {
            double newLoudness = list[i].getLoudness();
            if (newLoudness> loudness) {
                loudness = newLoudness;
            }
        }
        return loudness;
    }
}