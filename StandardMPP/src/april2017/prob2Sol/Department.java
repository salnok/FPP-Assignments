package april2017.prob2Sol;

public abstract class Department {

    private StringQueue queue = new StringQueue();

    public abstract String getName();

    public void addMessage(String msg) {
        this.queue.enqueue(msg);
    }

    public String nextMessage() {

        String nextMessage = null;

        try {
            nextMessage = this.queue.dequeue();
        } catch (EmptyQueueException e) {
            e.printStackTrace();
        }

        return nextMessage;
    }

    public StringQueue getQueue() {
        return queue;
    }
    //implement
}
