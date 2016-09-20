package com.locus.entities;

import java.util.HashSet;

public class UserRole extends Role{
    @Override
    public boolean isActionAllowed(ActionType action) {
        return actions.contains(action);
    }
    public UserRole()
    {
        actions = new HashSet<>();
        actions.add(ActionType.WRITE);
    }
}