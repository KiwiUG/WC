package model;

import java.util.ArrayList;

public class Teams {
    String name;
    int position;
    String group;
    String color;
    ArrayList<Players> player;

    public Teams(String name, int position, String group, String color, ArrayList<Players> player) {
        this.name = name;
        this.position = position;
        this.group = group;
        this.color = color;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Players> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Players> player) {
        this.player = player;
    }

    public void p_list(){

    }
}
