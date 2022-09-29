package kr.co.greenapple.beans;

public class BookBean {
	
	private int service_idx;
	
	private String service_start;
	
	private String service_end;
	
	private boolean service_check;
	
	private int user_idx;
	
	private int dog_idx;

	public int getService_idx() {
		return service_idx;
	}

	public void setService_idx(int service_idx) {
		this.service_idx = service_idx;
	}

	public String getService_start() {
		return service_start;
	}

	public void setService_start(String service_start) {
		this.service_start = service_start;
	}

	public String getService_end() {
		return service_end;
	}

	public void setService_end(String service_end) {
		this.service_end = service_end;
	}

	public boolean isService_check() {
		return service_check;
	}

	public void setService_check(boolean service_check) {
		this.service_check = service_check;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public int getDog_idx() {
		return dog_idx;
	}

	public void setDog_idx(int dog_idx) {
		this.dog_idx = dog_idx;
	}

}
