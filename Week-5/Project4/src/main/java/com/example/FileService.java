package com.example;
public class FileService {
    private MyFileReader reader;
    private MyFileWriter writer;
    public FileService(MyFileReader reader,
                       MyFileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    public void copyFile() {
        String content = reader.readFile();
        writer.writeFile(content);
    }
}