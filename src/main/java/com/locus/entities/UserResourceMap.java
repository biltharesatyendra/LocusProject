package com.locus.entities;


public class UserResourceMap {
    private String userId,resourceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserResourceMap{" +
                "userId='" + userId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
