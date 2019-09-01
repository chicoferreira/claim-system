# Claim System
Claim system is a simple, versatile and fast plugin that allows players to claim chunks. 

## Building
You can build Claim System using maven.

### Requirements
- Java 8
- Maven
- Git

### Procedures

Open console and type:

```shell script
git clone https://github.com/chicoferreira/claim-system.git
cd claim-system
mvn install
```

Finally open generated `/target` folder and there will be your compiled version.

## Project Structure

This project is divided into different modules.

* **Core** - API and some implementation of it without touching any of the minecraft parts.
* **Bukkit** - The rest of the implementation related with the platform. 