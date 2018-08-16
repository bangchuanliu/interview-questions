package org.ood.filesystem;

public abstract class Entry {
	protected Directory parent;
	protected String name;
	protected long created;
	protected long lastUpdated;
	protected long lastAccessed;
}
