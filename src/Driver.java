public class Driver {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setName("Lab C");
        room1.setCapacity(23);

        Room room2 = new Room("Lab B", 50);

        SmokeDetector sd = new SmokeDetector(50);

        //Q3

        sd.addRoomToBeMonitored(room1);
        sd.addRoomToBeMonitored(room2);

        //Q4
        sd.checkAlarm(75);

        //Q5
        sd.checkAlarm(33);

    }
}
