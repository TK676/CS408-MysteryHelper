package com.example.mysteryhelper;

public class MysteryHelper {
    String[] textFragments;
    public MysteryHelper(String[] s) {
        textFragments = s;
    }

    //Gets a random text fragment from the list of strings
    public String getRandText () {
        return textFragments[(int) Math.floor(Math.random() * (textFragments.length))];
    }
}

