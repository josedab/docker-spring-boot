package demo.model;

public class Session {
	private String user;
	private long timestamp;

	public Session() {
		user = "current";
		timestamp = System.currentTimeMillis();
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getUser() {
		return user;
	}

	public long getTimestamp() {
		return timestamp;
	}

}
