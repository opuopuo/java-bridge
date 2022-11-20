package bridge;

import java.util.List;

public class Bridge {
    private final List<String> bridge;

    public Bridge(List<String> bridge) {
        this.bridge = bridge;
    }

    public int getSize() {
        return bridge.size();
    }

    public String getAnswerDirection(int index) {
        return bridge.get(index);
    }

    public void add(String element) {
         bridge.add(element);
    }

    public List<String> getBridge() {
        return bridge;
    }
}
