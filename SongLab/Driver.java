package SongLab;

public class Driver {
    public static void main(String[] args)
    {
        ReadData r = new ReadData();
        Song [] list = r.read();
        System.out.println("Longest title " + r.getLongestTitle(list));
        System.out.println("Year for 1995 " + r.filterByYear(list, 1995));
        System.out.println("All songs with danceability > 0.80 " + r.FilterByDanceability(list, 0.80));
         System.out.println("The longest length " + r.getLongestLen(list));
          System.out.println("The lowest shakeability " + r.getLowestShakeability(list));
          System.out.println("The loudest song " + r.getLoudestSong(list));
    }

}
