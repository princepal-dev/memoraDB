package com.memoraDB.store;

import java.util.concurrent.ConcurrentMap;

public class InMemoryDB {
    private final ConcurrentMap<String, String> store;

    public InMemoryDB(ConcurrentMap<String, String> store) {
        this.store = store;
    }

    public void set (String key, String value) {
        store.put(key, value);
    }

    public String get(String key) {
        return store.get(key);
    }

    public void delete (String key) {
        store.remove(key);
    }

    public ConcurrentMap<String, String> getStore() {
        return store;
    }
}
