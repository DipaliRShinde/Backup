package com.stackroute.hackathon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class MetadataFileAttributes {

    public static void main(String[] args) throws IOException {
        Path file= Paths.get("/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/file");
        BasicFileAttributes basicfile = Files.readAttributes(file, BasicFileAttributes.class);

        System.out.println("creationTime: " + basicfile.creationTime());
        System.out.println("lastModifiedTime: " + basicfile.lastModifiedTime());
        System.out.println("lastAccessTime: " + basicfile.lastAccessTime());
        System.out.println("isDirectory: " + basicfile.isDirectory());
        System.out.println("isOther: " + basicfile.isOther());
        System.out.println("isRegularFile: " + basicfile.isRegularFile());
        System.out.println("isSymbolicLink: " + basicfile.isSymbolicLink());
        System.out.println("size: " + basicfile.size());
    }
}
