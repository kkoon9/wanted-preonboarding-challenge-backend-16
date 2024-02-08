package com.wanted.preonboarding.problem1;

public class Queen extends Character {
    @Override
    void fight() {
        System.out.println("I'm a Queen");
        getWeapon().attack();
    }
}
