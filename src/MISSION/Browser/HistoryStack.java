package MISSION.Browser;

public class HistoryStack {
    private Page[] stackArray = new Page[5];
    private int currentIndex = 0;

    public void push(Page newPage) {
        if (currentIndex >= stackArray.length) {
            Page[] expandedStackArray = new Page[stackArray.length * 2];
            for (int filler = 0; filler < stackArray.length; filler++) {
                expandedStackArray[filler] = stackArray[filler];
            }
            stackArray = expandedStackArray;
        }
        stackArray[currentIndex] = newPage;
        currentIndex++;
    }

    public Page pop() {
        if (currentIndex == 0) {
            System.out.println("Nothing to return");
            return null;
        } else {
            currentIndex --;
            return stackArray[currentIndex];
        }
    }
}
