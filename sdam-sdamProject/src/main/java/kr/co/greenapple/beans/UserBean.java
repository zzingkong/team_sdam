package kr.co.greenapple.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserBean {
	private int user_idx;
	
	@Size(min=2, max=4)
	@Pattern(regexp = "[가-힣]*")
	private String user_name;
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_id;
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_pw;
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_pw2;
	
	@Size(min=10, max=11)
	@Pattern(regexp = "[0-9]{10,11}", message = "10~11자리의 숫자만 입력가능합니다")
	private String user_tel;
	
	private String user_address;
	
	private String user_license;
	private String user_resume;
	private int user_star;
	private String user_pic;
	private String user_info;
	private int company_idx;
	
	private boolean userIdExist;
	private boolean userTelExist;
	private boolean userLogin;
	
	public UserBean() {
		this.userIdExist = false;
		this.userTelExist = false;
		this.userLogin = false;
	}
	
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_pw2() {
		return user_pw2;
	}
	public void setUser_pw2(String user_pw2) {
		this.user_pw2 = user_pw2;
	}

	public boolean isUserIdExist() {
		return userIdExist;
	}

	public void setUserIdExist(boolean userIdExist) {
		this.userIdExist = userIdExist;
	}

	public boolean isUserLogin() {
		return userLogin;
	}

	public void setUserLogin(boolean userLogin) {
		this.userLogin = userLogin;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public boolean isUserTelExist() {
		return userTelExist;
	}

	public void setUserTelExist(boolean userTelExist) {
		this.userTelExist = userTelExist;
	}

	public String getUser_license() {
		return user_license;
	}

	public void setUser_license(String user_license) {
		this.user_license = user_license;
	}

	public String getUser_resume() {
		return user_resume;
	}

	public void setUser_resume(String user_resume) {
		this.user_resume = user_resume;
	}

	public int getUser_star() {
		return user_star;
	}

	public void setUser_star(int user_star) {
		this.user_star = user_star;
	}

	public String getUser_pic() {
		return user_pic;
	}

	public void setUser_pic(String user_pic) {
		this.user_pic = user_pic;
	}

	public String getUser_info() {
		return user_info;
	}

	public void setUser_info(String user_info) {
		this.user_info = user_info;
	}

	public int getCompany_idx() {
		return company_idx;
	}

	public void setCompany_idx(int company_idx) {
		this.company_idx = company_idx;
	}
	
	
}
