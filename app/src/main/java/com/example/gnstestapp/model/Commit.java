package com.example.gnstestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Commit implements Serializable {
    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("distinct")
    @Expose
    private boolean distinct;
    @SerializedName("url")
    @Expose
    private String url;

    public Commit() {
    }

    public Commit(String sha, Author author, String message, boolean distinct, String url) {
        super();
        this.sha = sha;
        this.author = author;
        this.message = message;
        this.distinct = distinct;
        this.url = url;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Commit withSha(String sha) {
        this.sha = sha;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Commit withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Commit withMessage(String message) {
        this.message = message;
        return this;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public Commit withDistinct(boolean distinct) {
        this.distinct = distinct;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Commit withUrl(String url) {
        this.url = url;
        return this;
    }
}
