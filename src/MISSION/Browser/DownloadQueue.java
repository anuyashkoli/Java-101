package MISSION.Browser;

public class DownloadQueue {
    private String[] queueArray = new String[10];
    private int currentIndex = 0;

    public void enQueue(String fileName) {
        if (currentIndex >= queueArray.length) {
            String[] extendedQueueArray = new String[queueArray.length * 2];
            for (int filler = 0; filler < queueArray.length; filler++) {
                extendedQueueArray[filler] = queueArray[filler];
            }
            queueArray = extendedQueueArray;
        }
        queueArray[currentIndex] = fileName;
        currentIndex++;
    }

    public String deQueue() {
        if (currentIndex == 0) {
            return "No Downloads Pending";
        } else {
            String downloading = queueArray[0];

            for (int lineup = 1; lineup < currentIndex; lineup++) {
                queueArray[lineup - 1] = queueArray[lineup];
            }
            currentIndex--;
            return downloading;
        }
    }
}
