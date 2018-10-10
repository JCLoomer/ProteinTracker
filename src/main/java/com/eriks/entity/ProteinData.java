package com.eriks.entity;

public class ProteinData {

    private int total;
    private int goal;

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
    
    public String toString (boolean begining){
        StringBuilder sb = new StringBuilder();
        if(begining)
            sb.append("Total: ").append(total).append(", Goal: ").append(goal);
        else
            sb.append(", Total: ").append(total).append(", Goal: ").append(goal);
        
        return sb.toString();
    }
}
