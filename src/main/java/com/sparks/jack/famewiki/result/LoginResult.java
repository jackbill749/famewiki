package com.sparks.jack.famewiki.result;

import com.sparks.jack.famewiki.constant.Retcode;

/**
 * Created with IntelliJ IDEA.
 * Description:登录返回结果
 * User: jack
 * Date: 2017/12/11
 * Time: 23:55
 */
public class LoginResult extends CommonResult{
	private Long userid;
	private String username;
	private String nickname;
	private String avatar;
	private Integer gender;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "LoginResult{" +
				"userid=" + userid +
				", username='" + username + '\'' +
				", nickname='" + nickname + '\'' +
				", avatar='" + avatar + '\'' +
				", gender=" + gender +
				'}';
	}

	public LoginResult() {
	}

	public LoginResult(Integer retcode, String message, String describe) {
		super(retcode, message, describe);
	}

	public LoginResult(Retcode retcode) {
		super(retcode);
	}

	@Override
	public void setError(Retcode retcode) {
		super.setError(retcode);
	}
}
