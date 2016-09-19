package com.locus.entities;

import java.util.HashSet;
import java.util.Set;

public class Role {
	RoleType role;
	Set<ActionType> allActions = new HashSet<>();
	public RoleType getRole() {
		return role;
	}

	public void setRole(RoleType role) {
		this.role = role;
	}

	public Set<ActionType> getAllActions() {
		return allActions;
	}

	public void setAllActions(Set<ActionType> allActions) {
		this.allActions = allActions;
	}


}
