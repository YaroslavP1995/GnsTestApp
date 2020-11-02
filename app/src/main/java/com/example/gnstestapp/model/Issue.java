package com.example.gnstestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Issue  implements Serializable {
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("repository_url")
    @Expose
    private String repositoryUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = new ArrayList<Object>();
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("locked")
    @Expose
    private boolean locked;
    @SerializedName("assignee")
    @Expose
    private Object assignee;
    @SerializedName("assignees")
    @Expose
    private List<Object> assignees = new ArrayList<Object>();
    @SerializedName("milestone")
    @Expose
    private Object milestone;
    @SerializedName("comments")
    @Expose
    private int comments;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("closed_at")
    @Expose
    private Object closedAt;
    @SerializedName("author_association")
    @Expose
    private String authorAssociation;
    @SerializedName("active_lock_reason")
    @Expose
    private Object activeLockReason;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("performed_via_github_app")
    @Expose
    private Object performedViaGithubApp;

    public Issue() {
    }

    public Issue(String url, String repositoryUrl, String labelsUrl, String commentsUrl, String eventsUrl, String htmlUrl, long id, String nodeId, int number, String title, User user, List<Object> labels, String state, boolean locked, Object assignee, List<Object> assignees, Object milestone, int comments, String createdAt, String updatedAt, Object closedAt, String authorAssociation, Object activeLockReason, String body, Object performedViaGithubApp) {
        super();
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.locked = locked;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.authorAssociation = authorAssociation;
        this.activeLockReason = activeLockReason;
        this.body = body;
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Issue withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Issue withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Issue withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Issue withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Issue withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Issue withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Issue withId(int id) {
        this.id = id;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Issue withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Issue withNumber(int number) {
        this.number = number;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Issue withTitle(String title) {
        this.title = title;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Issue withUser(User user) {
        this.user = user;
        return this;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public Issue withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Issue withState(String state) {
        this.state = state;
        return this;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Issue withLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Issue withAssignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    public List<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public Issue withAssignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public Issue withMilestone(Object milestone) {
        this.milestone = milestone;
        return this;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Issue withComments(int comments) {
        this.comments = comments;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Issue withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Issue withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public Issue withClosedAt(Object closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public Issue withAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    public Object getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(Object activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public Issue withActiveLockReason(Object activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Issue withBody(String body) {
        this.body = body;
        return this;
    }

    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Issue withPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }
}
