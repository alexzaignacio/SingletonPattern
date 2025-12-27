public class HelpDeskStation {
    private String stationId;
    private QueueSystem queueSystem;

    public HelpDeskStation(String stationId, QueueSystem queueSystem) {
        this.stationId = stationId;
        this.queueSystem = queueSystem;
    }

    public void processNextCustomer() {
        if (queueSystem.getCurrentNumber() > 0) {
            System.out.println("Station " + stationId + " processing customer #" + queueSystem.getCurrentNumber());
            queueSystem.advanceQueue();
        } else {
            System.out.println("Station " + stationId + ": No customer in queue yet.");
        }
    }

    public void resetQueue(int newNumber) {
        System.out.println("Station " + stationId + " requesting queue reset.");
        queueSystem.resetQueueNumber(newNumber);
    }

    public String getStationId() {
        return stationId;
    }
}
