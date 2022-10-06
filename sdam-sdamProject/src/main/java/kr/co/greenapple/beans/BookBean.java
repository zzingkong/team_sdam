package kr.co.greenapple.beans;

public class BookBean {
	
	private int service_idx;
	
	private String service_date;
	
	private String service_time;
	
	private boolean service_check;
	
	private int user_idx;
	
	private int dog_idx;
	
	private String service_local;
	
	private String dog_tag; 
	
	private String dog_name;

	public String getDog_name() {
		return dog_name;
	}

	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;
	}

	public String getDog_tag() {
		return dog_tag;
	}

	public void setDog_tag(String dog_tag) {
		this.dog_tag = dog_tag;
	}

	public String getService_local() {
		return service_local;
	}

	public void setService_local(String service_local) {
		this.service_local = service_local;
	}

	public int getService_idx() {
		return service_idx;
	}

	public void setService_idx(int service_idx) {
		this.service_idx = service_idx;
	}

	

	public String getService_date() {
		return service_date;
	}

	public void setService_date(String service_date) {
		this.service_date = service_date;
	}

	public String getService_time() {
		return service_time;
	}

	public void setService_time(String service_time) {
		this.service_time = service_time;
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
