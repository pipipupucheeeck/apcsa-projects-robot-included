package SongLab;

public class Song {
    private String artist, title, genre, topic;
    private int year, length;
    private double obscene, danceability, loudness;
    
    public Song(String artist, String title, int year, String genre, int length,
    double shake, double obscene, double danceability, double loudness, String topic)
    {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.length = length;
        this.obscene = obscene;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic; 
    }
    public String getTopic();
    {
        return topic;
    }
    public double getLoudness();
    {
        return loudness;
    }
    public double getDanceability();
    {
        return danceability;
    }

    public double getObscene();
    {
        return obscene;
    }
    public double getDanceability();
    {
        return danceability;
}
    public double getLoudness();
    {
        return loudness();
    }
    public String getTopic();
    {
        return topic;
    }

}