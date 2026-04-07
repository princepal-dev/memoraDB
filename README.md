# MemoraDB

MemoraDB is a lightweight in-memory key-value store built in Java, inspired by Redis.

## Features

* Set, get, and delete key-value pairs
* In-memory storage for fast access
* TCP server to handle multiple clients
* Thread-safe operations

## Tech Stack

* Java
* Maven
* TCP Sockets
* ConcurrentHashMap

## Getting Started

### Prerequisites

* Java 17+
* Maven

### Run the project

```bash
mvn clean install
java -cp target/memoradb-1.0-SNAPSHOT.jar com.memoradb.Main
```

## Example Commands

```
SET name prince
GET name
DEL name
```

## Project Structure

```
server/        -> Handles client connections
store/         -> Core key-value storage
command/       -> Command implementations
parser/        -> Input parsing
persistence/   -> Data persistence (planned)
eviction/      -> Cache eviction (planned)
```

## Future Improvements

* TTL (key expiration)
* Persistence (AOF / snapshots)
* LRU eviction
* Custom protocol (Redis-like)

## Inspiration

Inspired by Redis and how in-memory databases are designed.

---

Built for learning system design and low-level backend concepts.
