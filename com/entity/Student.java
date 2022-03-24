package com.entity;

public class Student {
    private int stdID;
    private String stdName;
    private String stdFname;
    private String stdPersentAge;
    private String stdAddress;
    private String stdCource;

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdFname() {
        return stdFname;
    }

    public void setStdFname(String stdFname) {
        this.stdFname = stdFname;
    }

    public String getStdPersentAge() {
        return stdPersentAge;
    }

    public void setStdPersentAge(String stdPersentAge) {
        this.stdPersentAge = stdPersentAge;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public String getStdCource() {
        return stdCource;
    }

    public void setStdCource(String stdCource) {
        this.stdCource = stdCource;
    }

    public String toString() {
        return stdID + "," + stdName + "," + stdFname + "," + stdPersentAge + "," + stdAddress + "," + stdCource;
    }
}
