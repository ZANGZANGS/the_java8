package the.java8.stream;

import the.java8.optional.Progress;

import java.util.Optional;

public class OnlineClass {

    private int id;
    private String title;
    private boolean closed;
    private Progress progress;

    public OnlineClass(int id, String title, boolean closed){
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isClosed() {
        return closed;
    }

    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
    }

}
