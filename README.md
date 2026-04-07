# MemoraDB

MemoraDB is a lightweight in-memory key-value store built in Java, inspired by Redis.

## Tech Stack

* Java 21
* Maven
* ConcurrentHashMap

## Getting Started

### Prerequisites

* Java 21
* Maven

### Run the project

```bash
mvn clean install
java -cp target/memoraDB-1.0-SNAPSHOT.jar com.memoraDB.Main
```

## Example Commands

```
SET name prince
GET name
DEL name
EXISTS name
```

---

## Status: What's Done ✅

- [x] In-memory key-value storage (ConcurrentHashMap)
- [x] Basic commands: SET, GET, DEL, EXISTS
- [x] Console-based REPL interface
- [x] Thread-safe operations (ConcurrentHashMap)
- [x] Command pattern architecture
- [x] Input reader utility (FastReader)

## Status: What's TODO 📝

- [ ] TCP server for multi-client support
- [ ] Custom protocol (Redis-like)
- [ ] Input parser (for advanced parsing)
- [ ] Data persistence (AOF / snapshots)
- [ ] TTL/Key expiration
- [ ] LRU cache eviction policy
- [ ] Error handling & validation
- [ ] Unit tests
- [ ] Performance benchmarks

---

## Project Structure

```
src/main/java/com/memoraDB/
├── Main.java              ✅ Console REPL entry point
├── command/
│   ├── SetCommand.java    ✅ SET key value
│   ├── GetCommand.java    ✅ GET key
│   ├── DelCommand.java    ✅ DEL key
│   └── ExistsCommand.java ✅ EXISTS key
├── store/
│   └── InMemoryDB.java    ✅ Core storage wrapper
├── server/                📝 TCP server (planned)
├── parser/                📝 Input parser (planned)
├── persistance/           📝 Persistence layer (planned)
├── eviction/              📝 Cache eviction (planned)
└── util/
    └── FastReader.java    ✅ Input utility

```

## Inspiration

Inspired by Redis and how in-memory databases are designed.

---

Built with ❤️ by Prince
