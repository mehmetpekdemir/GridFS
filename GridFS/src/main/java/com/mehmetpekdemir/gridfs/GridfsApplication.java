package com.mehmetpekdemir.gridfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * When to Use GridFS ?
 * 
 * In MongoDB, use GridFS for storing files larger than 16 MB.
 * 
 * In some situations, storing large files may be more efficient in a MongoDB
 * database than on a system-level filesystem.
 * 
 * <p>
 * If your filesystem limits the number of files in a directory, you can use
 * GridFS to store as many files as needed.
 * </p>
 * 
 * <p>
 * When you want to access information from portions of large files without
 * having to load whole files into memory, you can use GridFS to recall sections
 * of files without reading the entire file into memory.
 * </p>
 * 
 * <p>
 * When you want to keep your files and metadata automatically synced and
 * deployed across a number of systems and facilities, you can use GridFS. When
 * using geographically distributed replica sets, MongoDB can distribute files
 * and their metadata automatically to a number of mongod instances and
 * facilities.
 * </p>
 * 
 * </p>
 * 
 * <p>
 * Do not use GridFS if you need to update the content of the entire file
 * atomically. As an alternative you can store multiple versions of each file
 * and specify the current version of the file in the metadata. You can update
 * the metadata field that indicates “latest” status in an atomic update after
 * uploading the new version of the file, and later remove previous versions if
 * needed.
 * 
 * Furthermore, if your files are all smaller than the 16 MB BSON Document Size
 * limit, consider storing each file in a single document instead of using
 * GridFS. You may use the BinData data type to store the binary data. See your
 * drivers documentation for details on using BinData.
 * </p>
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@SpringBootApplication
public class GridfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GridfsApplication.class, args);
	}

}
