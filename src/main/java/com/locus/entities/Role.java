package com.locus.entities;

import java.util.Set;
public abstract class Role {
	Set<ActionType> actions;
	public abstract  boolean isActionAllowed(ActionType action);

	@Override
	public String toString() {
		return "Role{" +
				"actions=" + actions +
				'}';
	}

	public Set<ActionType> getActions() {
		return actions;
	}

	public void setActions(Set<ActionType> actions) {
		this.actions = actions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Role role = (Role) o;

		return actions != null ? actions.equals(role.actions) : role.actions == null;

	}

	@Override
	public int hashCode() {
		return actions != null ? actions.hashCode() : 0;
	}
}
