package com.pluralsight.model;

import java.util.Date;

public class Speaker {

    private String firstName;
    private String latsName;
    private String speakerType;

    private Person person;
    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    public Date getSpeakTime() {
        return speakTime;
    }

    public void setSpeakTime(Date speakTime) {
        this.speakTime = speakTime;
    }

    private Date speakTime;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatsName() {
        return latsName;
    }

    public void setLatsName(String latsName) {
        this.latsName = latsName;
    }
}
