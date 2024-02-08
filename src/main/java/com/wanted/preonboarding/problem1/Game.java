package com.wanted.preonboarding.problem1;


public class Game {
    public static void main(String[] args) {
        King king = new King();
        king.setWeapon(new KnifeBehavior());
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
