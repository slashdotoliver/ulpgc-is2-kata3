package software.ulpgc.kata3.persistence.readers.files;

import software.ulpgc.kata3.model.entities.Title;
import software.ulpgc.kata3.persistence.deserializers.files.TsvTitleDeserializer;
import software.ulpgc.kata3.persistence.readers.TitleReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class TsvTitleReader implements TitleReader {

    private final File file;
    private final boolean hasHeader;

    public TsvTitleReader(File file, boolean hasHeader) {
        this.file = file;
        this.hasHeader = hasHeader;
    }

    @Override
    public List<Title> read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if (hasHeader) readHeaderWith(reader);
            return reader.lines()
                    .map(new TsvTitleDeserializer()::deserialize)
                    .flatMap(Optional::stream)
                    .toList();
        }
    }

    private void readHeaderWith(BufferedReader reader) throws IOException {
        reader.readLine();
    }
}
