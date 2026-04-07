package com.memoraDB.command;

import java.util.concurrent.ConcurrentMap;

public class GetCommand {
    private final ConcurrentMap<String, String> store;

    public GetCommand(ConcurrentMap<String, String> store) {
        this.store = store;
    }

    public String execute(String key) {
        return store.getOrDefault(key, "NULL");
    }
}
