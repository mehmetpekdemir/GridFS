# GridFS

### This is a basic GridFS project.

### Tech Stack
  - Java 11
  - Spring Boot
  - MongoDB
  - GridFS
  - Docker
  
### Requirements

For building and running the application you need:
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or newer . 
- [Maven](https://maven.apache.org)
- [Docker](https://www.docker.com/)


### Build & Run 

```
  docker-compose -f "YOUR_LOCATION\docker-compose.yml" up -d 
```

```
  mvn clean install && mvn --projects GridFS spring-boot:run
```

### Port
```
  http://localhost:8081
```

### When to Use GridFS

In MongoDB, use GridFS for storing files larger than 16 MB.

In some situations, storing large files may be more efficient in a MongoDB database than on a system-level filesystem.

If your filesystem limits the number of files in a directory, you can use GridFS to store as many files as needed.
When you want to access information from portions of large files without having to load whole files into memory, you can use GridFS to recall sections of files without reading the entire file into memory.
When you want to keep your files and metadata automatically synced and deployed across a number of systems and facilities, you can use GridFS. When using geographically distributed replica sets, MongoDB can distribute files and their metadata automatically to a number of mongod instances and facilities.
Do not use GridFS if you need to update the content of the entire file atomically. As an alternative you can store multiple versions of each file and specify the current version of the file in the metadata. You can update the metadata field that indicates “latest” status in an atomic update after uploading the new version of the file, and later remove previous versions if needed.

Furthermore, if your files are all smaller than the 16 MB BSON Document Size limit, consider storing each file in a single document instead of using GridFS. You may use the BinData data type to store the binary data. See your drivers documentation for details on using BinData.
