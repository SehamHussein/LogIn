package com.example.pc.login;

import java.io.Serializable;

/**
 * Created by System.Life on 9/19/2017.
 */

public class User implements Serializable {
    public User(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    String name;    int pass;
}
