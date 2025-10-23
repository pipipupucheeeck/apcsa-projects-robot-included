package SongLab;

public class Song {
    private String artist, title, genre, topic;
    private int year, length;
    private double obscene, danceability, loudness, shake;

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
        this.shake = shake;
    }
    public String getTopic()
    {
        return topic;
    }
    public double getLoudness()
    {
        return loudness;
    }

    public double getObscene()
    {
        return obscene;
    }
    public double getDanceability()
    {
        return danceability;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
     public int getLength()
    {
        return length;
    }
    public double getShakeability()
    {
        return shake;
    }
}
