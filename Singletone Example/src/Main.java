public class Main {
    public static void main(String[] args) {
        EventLogger logger1 = EventLogger.getInstance();

        logger1.eventLog("Event 1");
        logger1.eventLog("Event 2");
        logger1.eventLog("Event 3");

        EventLogger logger2 = EventLogger.getInstance();

        logger2.eventLog("Event 4");
        logger2.eventLog("Event 5");
        logger2.eventLog("Event 6");
    }
}