package com.wanted.preonboarding.problem1;

import lombok.Getter;

@Getter
public abstract class Character {
    private WeaponBehavior weapon;

    abstract void fight();

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
