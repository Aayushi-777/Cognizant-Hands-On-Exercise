package com.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class FileServiceTest {
    @Test
    void testFileOperations() {
        MyFileReader reader =
                mock(MyFileReader.class);
        MyFileWriter writer =
                mock(MyFileWriter.class);
        when(reader.readFile())
                .thenReturn("Mockito File");
        FileService service =
                new FileService(reader, writer);
        service.copyFile();
        verify(reader).readFile();
        verify(writer)
                .writeFile("Mockito File");
    }
}