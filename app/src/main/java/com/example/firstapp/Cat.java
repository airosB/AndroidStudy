package com.example.firstapp;

import android.util.Log;

public class Cat {
    String name;
    int age;
    String gender;
    String breed;

    public Cat(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    void say(String message) {
        Log.d("Cat", this.name + "「" + message + "」");
    }

    void sleep() {
        if (this.age <= 2) {
            say("zzz");
        } else {
            say("ZZZ");
        }
    }

    void greet() {
        say(this.name + "は" + this.age + "歳の" + this.gender + this.breed + "だにゃ");
    }

    void talkAbout(Cat another) {
        if (this == another) {
            say(another.name + ": it's me!");
        } else if (this.age < another.age) {
            say(another.name + ": senpai!");
        } else if (this.gender != another.gender) {
            say(another.name + ": love!");
        } else {
            say(another.name + ": friend!");
        }
    }
}
