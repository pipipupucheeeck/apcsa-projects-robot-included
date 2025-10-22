package SongLab;

public class Driver {
    public static void main(String[] args)
    {
        ReadData r = new ReadData();
        Song [] list = r.read();
        System.out.println("Longest title" + r.getLongestTitle(list));
    }

}
