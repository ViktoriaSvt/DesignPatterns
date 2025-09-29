package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class FileAddSubscriber implements Subscriber {
    private List<String> files = new ArrayList<>();

    public FileAddSubscriber() {
        this.files = new ArrayList<>();
    }


    @Override
    public void update(String file) {
        files.add(file);
        System.out.println("New file added - " + file);
    }
}
