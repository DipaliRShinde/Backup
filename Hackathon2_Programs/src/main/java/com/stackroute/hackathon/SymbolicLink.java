package com.stackroute.hackathon;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolicLink {
    public static void main(String[] args) throws Exception
    {
        Path existingFilePath = Paths.get("/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/file");
        Path symLinkPath = Paths.get("/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/SymbolicLinkFile");
        Files.createSymbolicLink(symLinkPath, existingFilePath);
        System.out.println("Symbalic link created");
    }
}
