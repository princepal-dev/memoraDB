package com.memoraDB.command;

import java.util.concurrent.ConcurrentMap;

public class ExistsCommand {
    private final ConcurrentMap<String, String> store;

    public ExistsCommand(ConcurrentMap<String, String> store) {
        this.store = store;
    }

    public String execute(String key) {
        return store.containsKey(key) ? "1" : "0";
    }
}
