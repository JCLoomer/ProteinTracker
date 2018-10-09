package com.eriks.entity;

public class User {
    
    private int id;
    private String name;
    private int total;
    private int goal;

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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Name: ").append(name).append(", Total: ").append(total).append(", Goal: ").append(goal).append(".");
        return sb.toString();
    }
}
