package com.gautam.mobileaApp.model;

public class UserDetails {
    private int userId;
    private String userName;
    private String userAddress;
    private String emailId;
    private String mobile;

    public UserDetails() {
    }

    public UserDetails(int userId, String userName, String userAddress, String emailId, String mobile) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.emailId = emailId;
        this.mobile = mobile;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String passwd) {
        this.mobile = passwd;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
