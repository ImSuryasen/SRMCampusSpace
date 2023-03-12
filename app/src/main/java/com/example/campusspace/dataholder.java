package com.example.campusspace;

import android.widget.Button;
import android.widget.TextView;

public class dataholder {
    String building, floor, room, startdate, enddate, starttime, endtime;

    public dataholder(Button building, Button floor, Button room, TextView startdate, TextView enddate, TextView starttime, TextView endtime) {
        this.building = String.valueOf(building);
        this.floor = String.valueOf(floor);
        this.room = String.valueOf(room);
        this.startdate = String.valueOf(startdate);
        this.enddate = String.valueOf(enddate);
        this.starttime = String.valueOf(starttime);
        this.endtime = String.valueOf(endtime);


    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

}
