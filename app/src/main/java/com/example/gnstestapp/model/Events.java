package com.example.gnstestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Events implements Serializable {
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("actor")
    @Expose
    private Actor actor;
    @SerializedName("repo")
    @Expose
    private Repo repo;
    @SerializedName("payload")
    @Expose
    private Payload payload;
    @SerializedName("public")
    @Expose
    private boolean _public;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("org")
    @Expose
    private Org org;
    @SerializedName("user")
    @Expose
    private User user;



    public Events() {
    }

    public Events(long id, String type, Actor actor, Repo repo, Payload payload, boolean _public, String createdAt, Org org, User user) {
        super();
        this.id = id;
        this.type = type;
        this.actor = actor;
        this.repo = repo;
        this.payload = payload;
        this._public = _public;
        this.createdAt = createdAt;
        this.org = org;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Events withId(long id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Events withType(String type) {
        this.type = type;
        return this;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Events withActor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public Events withRepo(Repo repo) {
        this.repo = repo;
        return this;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Events withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

    public boolean isPublic() {
        return _public;
    }

    public void setPublic(boolean _public) {
        this._public = _public;
    }

    public Events withPublic(boolean _public) {
        this._public = _public;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Events withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public Events withOrg(Org org) {
        this.org = org;
        return this;
    }

}
