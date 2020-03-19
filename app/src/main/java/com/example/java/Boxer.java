package com.example.java;

public class Boxer implements Fighter {
    @Override
    public String jabPunch() {
        return "boxer Jab";
    }

    @Override
    public String doubleKick() {
        return "double kick";
    }

    @Override
    public String flyingKick() {
        return "flying kick";
    }
}
