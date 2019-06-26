package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    Actor actor;

    Movie() {

    }

    @Autowired
    Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
