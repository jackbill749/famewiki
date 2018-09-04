package com.sparks.jack.famewiki.param;

import org.parboiled.common.StringUtils;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: 用户注册参数类
 * User: jack
 * Date: 2018/3/12
 * Time: 22:59
 */
public class RegisterParam implements IParamCheck{
    private String username;    //用户名
    private String nickname;    //昵称
    private String salt;        //密码作料
    private String password;    //密码
    private String avatar;     //头像地址
    private Integer gender;   //性别 0-女,1-男
    private String cellphone; //手机号码
    private String email;       //邮箱
    private String birthday;    //生日
    private String describe;    //描述
    private String region;      //所在地区
    private String country;     //国籍
    private Date rtime;       //注册时间
    private String ip;          //注册ip

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "RegisterParam{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", salt='" + salt + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", describe='" + describe + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", rtime=" + rtime +
                ", ip='" + ip + '\'' +
                '}';
    }

    @Override
    public boolean paramVerify() {
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(nickname) || StringUtils.isEmpty(password) || gender < 0
                || !isValidPhone(cellphone) || !isValidEmail(email)){
            return false;
        }
        return true;
    }
}
