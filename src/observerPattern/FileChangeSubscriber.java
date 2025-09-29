package observerPattern;

public class FileChangeSubscriber  implements Subscriber{

    private String fileName;

    public FileChangeSubscriber(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void update(String name) {
        fileName = name;
        System.out.println("New file name set - " + name);
    }
}
