package software.ulpgc.kata3.persistence.readers;

import software.ulpgc.kata3.model.entities.Title;

import java.io.IOException;
import java.util.List;

public interface TitleReader {

    List<Title> read() throws IOException;

}
