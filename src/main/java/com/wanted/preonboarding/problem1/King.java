package com.wanted.preonboarding.problem1;

public class King extends Character {
    @Override
    void fight() {
        System.out.println("I'm a King");
        getWeapon().attack();
    }
}
