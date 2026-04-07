package com.memoraDB;

import com.memoraDB.command.DelCommand;
import com.memoraDB.command.ExistsCommand;
import com.memoraDB.command.GetCommand;
import com.memoraDB.command.SetCommand;
import com.memoraDB.store.InMemoryDB;
import com.memoraDB.util.FastReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
  static SetCommand setCommand;
  static GetCommand getCommand;
  static DelCommand delCommand;
  static ExistsCommand existsCommand;
  static final FastReader reader = new FastReader();
  static final Logger logger = LoggerFactory.getLogger(Main.class);
  static final InMemoryDB db = new InMemoryDB(new ConcurrentHashMap<>());

  static {
    logger.info("MemoraDB is initializing...");
    setCommand = new SetCommand(db.getStore());
    getCommand = new GetCommand(db.getStore());
    delCommand = new DelCommand(db.getStore());
    existsCommand = new ExistsCommand(db.getStore());
  }

  public static void main(String[] args) {
    logger.info("MemoraDB has been initialized successfully.");

    while (true) {
      System.out.print("> ");
      String command = reader.next();
      try {
        switch (command.toUpperCase()) {
          case "SET":
            String key = reader.next();
            String value = reader.next();
            logger.info(setCommand.execute(key, value));
            break;
          case "GET":
            key = reader.next();
            logger.info(getCommand.execute(key));
            break;
          case "DEL":
            key = reader.next();
            logger.info(delCommand.execute(key));
            break;
          case "EXISTS":
            key = reader.next();
            logger.info(existsCommand.execute(key));
            break;
          case "EXIT":
            logger.info("MemoraDB is shutting down...");
            return;
          default:
            logger.error("Unknown command: {}", command);
        }
      } catch (Exception e) {
        logger.error("Error executing command: ", e);
      }
    }
  }
}
