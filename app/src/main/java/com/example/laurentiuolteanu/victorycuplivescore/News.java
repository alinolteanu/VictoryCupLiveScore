package com.example.laurentiuolteanu.victorycuplivescore;

import java.io.Serializable;

public class News implements Serializable{
    String title;
    String content;
    String imageName;

    public News(String t, String c, String i){
        title = t;
        content = c;
        imageName = i;
    }
}
