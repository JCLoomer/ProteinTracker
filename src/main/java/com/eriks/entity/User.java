package com.eriks.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
    
    private int id;
    private String name;
    
    private ProteinData proteinData = new ProteinData();
    
    private List<UserHistory> history = new ArrayList<>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
    }

    public List<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(List<UserHistory> history) {
        this.history = history;
    }

    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Name: ").append(name).append(proteinData.toString(false)).append(".");
        return sb.toString();
    }
}
