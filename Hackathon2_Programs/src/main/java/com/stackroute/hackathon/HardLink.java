package com.stackroute.hackathon;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HardLink {
    public static void main(String args[]) throws Exception
    {
        Path existingFile = Paths.get("/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/file");
        Path newFile = Paths.get("/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/file1");
        Files.createLink(newFile, existingFile);
        System.out.println("Hard Link created");
    }
}
