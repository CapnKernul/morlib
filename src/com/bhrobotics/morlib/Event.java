package com.bhrobotics.morlib;

import java.util.Hashtable;

public class Event {
    private String name;
    private Hashtable data;
    
    public Event(String n, Hashtable d) {
        name = n;
        data = d;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public Hashtable getData() {
        return data;
    }
    
    public void setData(Hashtable d) {
        data = d;
    }
}