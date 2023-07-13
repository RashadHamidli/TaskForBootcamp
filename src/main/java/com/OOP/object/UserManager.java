package com.OOP.object;

import java.util.Calendar;

public class UserManager {
    private String userName, userSurname;
    private int dateOfBirthday;
    Calendar calendar = Calendar.getInstance();

    public int writeAge() {
        return calendar.get(calendar.YEAR) - dateOfBirthday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(int dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
