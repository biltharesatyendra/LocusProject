package com.locus.entities;


public class UserResource {
    private String userId,resourceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    @Override
    public String toString() {
        return "UserResource{" +
                "userId='" + userId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }
}
