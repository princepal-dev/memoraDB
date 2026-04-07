package com.memoraDB.command;

import java.util.concurrent.ConcurrentMap;

public class SetCommand {
    private final ConcurrentMap<String, String> store;

    public SetCommand(ConcurrentMap<String, String> store) {
        this.store = store;
    }

    public String execute(String key, String value) {
        store.put(key, value);
        return "OK";
    }
}
