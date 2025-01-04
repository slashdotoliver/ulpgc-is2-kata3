package software.ulpgc.kata3.control.readers;

import software.ulpgc.kata3.model.Title;

import java.io.IOException;
import java.util.List;

public interface TitleReader {

    List<Title> read() throws IOException;

}
