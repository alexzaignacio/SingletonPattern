public class QueueSystem {
    private int currentNumber;
    private OnlineMonitor onlineMonitor;

    public QueueSystem() {
        this.currentNumber = 0;
        this.onlineMonitor = new OnlineMonitor();
    }

    public int generateQueueNumber() {
        currentNumber++;
        onlineMonitor.updateDisplay(currentNumber);
        System.out.println("New queue number generated: " + currentNumber);
        return currentNumber;
    }

    public void resetQueueNumber(int newNumber) {
        if (newNumber >= 0) {
            this.currentNumber = newNumber;
            onlineMonitor.updateDisplay(currentNumber);
            System.out.println("Queue reset to: " + currentNumber);
        } else {
            System.out.println("Invalid reset number: must be >= 0");
        }
    }

    public void advanceQueue() {
        System.out.println("Serving number: " + currentNumber + " (advancing queue)");
        currentNumber++;
        onlineMonitor.updateDisplay(currentNumber);
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public OnlineMonitor getOnlineMonitor() {
        return onlineMonitor;
    }
}
