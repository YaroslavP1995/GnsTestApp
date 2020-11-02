package com.example.gnstestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Payload implements Serializable {
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("issue")
    @Expose
    private Issue issue;
    @SerializedName("push_id")
    @Expose
    private long pushId;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("distinct_size")
    @Expose
    private int distinctSize;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("head")
    @Expose
    private String head;
    @SerializedName("before")
    @Expose
    private String before;
    @SerializedName("commits")
    @Expose
    private List<Commit> commits = new ArrayList<Commit>();

    public Payload() {
    }

    public Payload(String action, Issue issue, long pushId, int size, int distinctSize, String ref, String head, String before, List<Commit> commits) {
        super();
        this.action = action;
        this.issue = issue;
        this.pushId = pushId;
        this.size = size;
        this.distinctSize = distinctSize;
        this.ref = ref;
        this.head = head;
        this.before = before;
        this.commits = commits;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Payload withAction(String action) {
        this.action = action;
        return this;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public Payload withIssue(Issue issue) {
        this.issue = issue;
        return this;
    }

    public long getPushId() {
        return pushId;
    }

    public void setPushId(long pushId) {
        this.pushId = pushId;
    }

    public Payload withPushId(long pushId) {
        this.pushId = pushId;
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Payload withSize(int size) {
        this.size = size;
        return this;
    }

    public int getDistinctSize() {
        return distinctSize;
    }

    public void setDistinctSize(int distinctSize) {
        this.distinctSize = distinctSize;
    }

    public Payload withDistinctSize(int distinctSize) {
        this.distinctSize = distinctSize;
        return this;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Payload withRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Payload withHead(String head) {
        this.head = head;
        return this;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public Payload withBefore(String before) {
        this.before = before;
        return this;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public Payload withCommits(List<Commit> commits) {
        this.commits = commits;
        return this;
    }
}
