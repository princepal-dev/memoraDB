package com.memoraDB;

import com.memoraDB.command.DelCommand;
import com.memoraDB.command.ExistsCommand;
import com.memoraDB.command.GetCommand;
import com.memoraDB.command.SetCommand;
import com.memoraDB.store.InMemoryDB;
import com.memoraDB.util.FastReader;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
  static SetCommand setCommand;
  static GetCommand getCommand;
  static DelCommand delCommand;
  static ExistsCommand existsCommand;
  static final FastReader reader = new FastReader();
  static final InMemoryDB db = new InMemoryDB(new ConcurrentHashMap<>());

  static {
    System.out.println("MemoraDB is initializing...");
    setCommand = new SetCommand(db.getStore());
    getCommand = new GetCommand(db.getStore());
    delCommand = new DelCommand(db.getStore());
    existsCommand = new ExistsCommand(db.getStore());
  }

  public static void main(String[] args) {
    System.out.println("MemoraDB is ready to accept commands.");

    while (true) {
      System.out.print("> ");
      String command = reader.next();
      try {
        switch (command.toUpperCase()) {
          case "SET":
            String key = reader.next();
            String value = reader.next();
            System.out.println(setCommand.execute(key, value));
            break;
          case "GET":
            key = reader.next();
            System.out.println(getCommand.execute(key));
            break;
          case "DEL":
            key = reader.next();
            System.out.println(delCommand.execute(key));
            break;
          case "EXISTS":
            key = reader.next();
            System.out.println(existsCommand.execute(key));
            break;
          case "EXIT":
            System.out.println("Exiting MemoraDB. Goodbye!");
            return;
          default:
            System.out.println("Unknown command: " + command);
        }
      } catch (Exception e) {
        System.out.println("Error executing command: " + e.getMessage());
      }
    }
  }
}
