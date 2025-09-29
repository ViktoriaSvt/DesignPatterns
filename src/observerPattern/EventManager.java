package observerPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {

    private HashMap<String, List<Subscriber>> listeners = new HashMap<>();

    public void subscribe(String eventType, Subscriber subscriber) throws Exception {
        if (!listeners.containsKey(eventType)) {
            listeners.put(eventType, new ArrayList<>());
        }
        listeners.get(eventType).add(subscriber);
    }

    public void unsubscribe(String eventType, Subscriber subscriber) throws Exception {
        if (!listeners.containsKey(eventType)) {
            throw new Exception();
        }
        listeners.get(eventType).remove(subscriber);
    }

    public void notify(String eventType, String filePath) {
        List<Subscriber> subs = listeners.get(eventType);
        if (subs != null) {
            for (Subscriber s : subs) {
                s.update(filePath);
            }
        }
    }

}



