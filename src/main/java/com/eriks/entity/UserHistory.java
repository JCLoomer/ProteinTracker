package com.eriks.entity;

import java.util.Date;
import java.util.Objects;

public class UserHistory {

    private Date entryTime;
    private String entry;

    public UserHistory() {
    }

    public UserHistory(Date entryTime, String entry) {
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.entryTime);
        hash = 41 * hash + Objects.hashCode(this.entry);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserHistory other = (UserHistory) obj;
        if (!Objects.equals(this.entry, other.entry)) {
            return false;
        }
        return Objects.equals(this.entryTime, other.entryTime);
    }

}