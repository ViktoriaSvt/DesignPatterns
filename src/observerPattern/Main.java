package observerPattern;

import singletonPattern.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to my file manager!");

        EventManager manager = new EventManager();

        FileAddSubscriber subscriber = new FileAddSubscriber();
        FileChangeSubscriber subscriber1 = new FileChangeSubscriber("starter.pdf");
        manager.subscribe("File add", subscriber );
        manager.subscribe("Name change", subscriber1);

        manager.notify("File add", "news.pdf");
        manager.unsubscribe("File add", subscriber);
        manager.notify("File add", "news.pdf");
        manager.notify("Name change", "update.pdf");


    }
}