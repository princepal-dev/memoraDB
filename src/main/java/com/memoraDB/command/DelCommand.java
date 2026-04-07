package com.memoraDB.command;

import java.util.concurrent.ConcurrentMap;

public class DelCommand {
    private ConcurrentMap<String, String> store;

    public DelCommand(ConcurrentMap<String, String> store) {
        this.store = store;
    }

    public String execute(String key) {
        if (store.remove(key) != null) {
            return "OK";
        } else {
            return "NULL";
        }
    }
}
