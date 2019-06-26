package com.stackroute.hackathon;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor {
    public static void main(String args[]) throws Exception
    {
        Path start = Paths.get("/home/dipali/Hackathon2/src/main/java/com/stackroute/hackathon/FileVisit/file");
        Files.walkFileTree(start, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)   throws IOException
            {
                Files.delete(file);
                System.out.println("File Deleted.....       ");
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException e)   throws IOException
            {
                if (e == null) {
                    Files.delete(dir);
                    System.out.println("Directory Deleted.....");
                    return FileVisitResult.CONTINUE;
                } else {
                    throw e;
                }
            }
        });

    }
}
