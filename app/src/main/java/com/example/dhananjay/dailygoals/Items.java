package com.example.android.dailygoals;

/**
 * Created by kmurali on 11-04-2018.
 */

public class Items {
    private String text;
    public Items(String text)
    {
        this.text=text;
    }
    public  String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
