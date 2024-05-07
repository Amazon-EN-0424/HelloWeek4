package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class Rapper {

    private String name;
    private String nickname;
    private List<String> songs = new ArrayList<>();


//    I want a method to add a String song to the rapper songs

    public void addSong(String song){
        songs.add(song);
    }

    public Rapper(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Rapper{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", songs=" + songs +
                '}';
    }
}
