import sun.awt.windows.WPrinterJob;

public class SmokeDetector {
    static private int smokeLevel = 0;

    private Room[] rooms;

    public static int getSmokeLevel() {
        return smokeLevel;
    }

    public static void setSmokeLevel(int smokeLevel) {
        SmokeDetector.smokeLevel = smokeLevel;
    }

    private float threshold;
    private int count = 0;

    public SmokeDetector() {
        rooms = new Room[50];
    }

    public SmokeDetector(float threshold) {
        rooms = new Room[50];
        this.threshold = threshold;
    }



    public int getRoomCount(){
        return count;
    }

    public boolean addRoomToBeMonitored(Room room) {
        if(++count < rooms.length ) {
            rooms[count-1] = room;
            return true;
        }
        else{
            count--;
            return false;
        }
    }

    public boolean checkAlarm(float smokeLevel){
        if(smokeLevel > threshold){
            System.out.println(String.format("%d rooms are in danger", getRoomCount()));
            System.out.println(String.format("%-14s %10s", "Name", "Capacity"));
            for (int i = 0; i < getRoomCount(); i++)
                System.out.println(String.format(("%-14s %6d"), rooms[i].getName(), rooms[i].getCapacity()));
            return true;
        }else
        {
            System.out.println(String.format("%d rooms are safe", getRoomCount() ));
            return false;
        }
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }
}
