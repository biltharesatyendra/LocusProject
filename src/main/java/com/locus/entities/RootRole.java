package com.locus.entities;

import java.util.HashSet;

public class RootRole extends Role{
    @Override
    public boolean isActionAllowed(ActionType action) {
        return actions.contains(action);
    }
    public RootRole()
    {
        actions = new HashSet<>();
        actions.add(ActionType.DELETE);
        actions.add(ActionType.READ);
        actions.add(ActionType.WRITE);
    }
}
