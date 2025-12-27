public class OnlineMonitor {
    private int currentDisplayed;

    public OnlineMonitor() {
        this.currentDisplayed = 0;
    }

    public void updateDisplay(int number) {
        this.currentDisplayed = number;
        System.out.println("Online Monitor updated: Now displaying #" + currentDisplayed);
    }

    public int getDisplay() {
        return currentDisplayed;
    }
}
