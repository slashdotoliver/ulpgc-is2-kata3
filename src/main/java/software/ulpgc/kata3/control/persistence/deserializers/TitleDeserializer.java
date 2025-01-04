package software.ulpgc.kata3.control.persistence.deserializers;

import software.ulpgc.kata3.model.Title;

import java.util.Optional;

public interface TitleDeserializer {

    Optional<Title> deserialize(String line);

}
