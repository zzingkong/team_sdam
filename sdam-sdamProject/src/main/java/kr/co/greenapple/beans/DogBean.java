package kr.co.greenapple.beans;

public class DogBean {

	private int dog_idx; 	 //테라피독PK
	private String dog_name; //이름
	private String dog_type; //견종
	private int dog_age; 	 //나이
	private String dog_sex;  //성별
	private String dog_neu;  //중성화여부
	private String dog_memo; //소개
	private String dog_pic;  //사진
//	private int user_idx;
	
	public int getDog_idx() {
		return dog_idx;
	}
	public void setDog_idx(int dog_idx) {
		this.dog_idx = dog_idx;
	}
	public String getDog_name() {
		return dog_name;
	}
	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;
	}
	public String getDog_type() {
		return dog_type;
	}
	public void setDog_type(String dog_type) {
		this.dog_type = dog_type;
	}
	public int getDog_age() {
		return dog_age;
	}
	public void setDog_age(int dog_age) {
		this.dog_age = dog_age;
	}
	public String getDog_sex() {
		return dog_sex;
	}
	public void setDog_sex(String dog_sex) {
		this.dog_sex = dog_sex;
	}
	public String getDog_neu() {
		return dog_neu;
	}
	public void setDog_neu(String dog_neu) {
		this.dog_neu = dog_neu;
	}
	public String getDog_memo() {
		return dog_memo;
	}
	public void setDog_memo(String dog_memo) {
		this.dog_memo = dog_memo;
	}
	public String getDog_pic() {
		return dog_pic;
	}
	public void setDog_pic(String dog_pic) {
		this.dog_pic = dog_pic;
	}
	
}
