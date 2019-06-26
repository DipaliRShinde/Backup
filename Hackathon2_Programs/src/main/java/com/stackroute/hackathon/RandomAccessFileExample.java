package com.stackroute.hackathon;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    static String filepath ="/home/dipali/Hackathon2_Programs/src/main/java/com/stackroute/hackathon/myFile";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(filepath, 0, 21)));
            System.out.println("Read Operation Completed Successfully......\n");
            writeToFile(filepath, "I love my country ", 28);
            System.out.println("Write Operation Completed Successfully......");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
    static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
