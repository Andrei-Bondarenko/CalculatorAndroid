package com.example.calculator;

import java.util.ArrayList;

public class StorySingleton {
    private static StorySingleton instance;

    private final ArrayList<String> storyList = new ArrayList();

    private StorySingleton() {
    }

    public static StorySingleton getInstance() {
        if (instance == null) {
            instance = new StorySingleton();
        }
        return instance;
    }

    public void setStoryEntry(String answer) {
        storyList.add(answer);
    }

    public ArrayList<String> getStoryList() {
        return storyList;
    }

}
