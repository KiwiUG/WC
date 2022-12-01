package model;

import java.util.ArrayList;

public class Groups {
    String name;
    ArrayList<Teams> team;

    public Groups(String name, ArrayList<Teams> team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teams> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Teams> team) {
        this.team = team;
    }
}
