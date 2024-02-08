package com.wanted.preonboarding.problem1;

public class Knight extends Character {
    @Override
    void fight() {
        System.out.println("I'm a Knight");
        getWeapon().attack();
    }
}
