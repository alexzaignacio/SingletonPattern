public class Main {
    public static void main(String[] args) {

        QueueSystem queueSystem = new QueueSystem();

        HelpDeskStation station1 = new HelpDeskStation("Desk 1", queueSystem);
        HelpDeskStation station2 = new HelpDeskStation("Desk 2", queueSystem);
        HelpDeskStation station3 = new HelpDeskStation("Desk 3", queueSystem);

        int customer1 = queueSystem.generateQueueNumber();
        int customer2 = queueSystem.generateQueueNumber();
        int customer3 = queueSystem.generateQueueNumber();

        station1.processNextCustomer();

        station2.processNextCustomer();

        station3.resetQueue(10);

        int customer4 = queueSystem.generateQueueNumber();
        station3.processNextCustomer();

        System.out.println("Current online display: #" + queueSystem.getOnlineMonitor().getDisplay());
    }
}
