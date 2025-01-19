package software.ulpgc.kata3.persistence.deserializers;

import software.ulpgc.kata3.model.entities.Title;

import java.util.Optional;

public interface TitleDeserializer {

    Optional<Title> deserialize(String line);

}
