package com.rd.Department;
import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<Personnel> personnelList;

    public Department(String name) {
        this.name = name;
        this.personnelList = new ArrayList<>();
    }

    public void addPersonnel(Personnel personnel) {
        personnelList.add(personnel);
    }

    public void removePersonnel(Personnel personnel) {
        personnelList.remove(personnel);
    }

    public void listPersonnel() {
        for (Personnel personnel : personnelList) {
            System.out.println(personnel);
        }
    }
}
