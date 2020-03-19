package com.example.java;

public class KickBoxer implements Fighter{
    @Override
    public String jabPunch() {
        return "Kickboxer Jab";
    }

    @Override
    public String doubleKick() {
        return "Kickboxer doubleKick";
    }

    @Override
    public String flyingKick() {
        return "Kickboxer flyingKick";
    }
}
