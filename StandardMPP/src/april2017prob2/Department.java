package april2017prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public  abstract String getName();
	
	
	public  String nextMessage() {
		
		String ss="";
		try {
		ss= queue.dequeue();
		}
		catch(EmptyQueueException ee) {
			
		}
		return ss;
	}
	public void addMessage(String msg) {
		this.queue.enqueue(msg);
	}
}
