package com.eriks.entity;

import java.util.HashMap;
import java.util.Map;

public class User {
    
    private int id;
    private String name;
    
    private ProteinData proteinData = new ProteinData();
    
    private Map<String, UserHistory> history = new HashMap<>();
    
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

    public Map<String, UserHistory> getHistory() {
        return history;
    }

    public void setHistory(Map<String, UserHistory> history) {
        this.history = history;
    }

    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Name: ").append(name).append(proteinData.toString(false)).append(".");
        return sb.toString();
    }
}
