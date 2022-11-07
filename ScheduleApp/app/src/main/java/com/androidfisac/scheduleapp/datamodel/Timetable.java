package com.androidfisac.scheduleapp.datamodel;

public class Timetable {
    private String sNo;
    private String className;
    private String startTime;
    private String endTime;
    private String roomNo;

    public Timetable(){
    }

    public Timetable(String sNo, String className, String startTime, String endTime, String roomNo)
    {
        this.sNo = sNo;
        this.className = className;
        this.startTime = startTime;
        this.endTime = endTime;
        this.roomNo = roomNo;
    }

    public String getsNo(){
        return sNo;
    }

    public String getClassName() {
        return className;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}





