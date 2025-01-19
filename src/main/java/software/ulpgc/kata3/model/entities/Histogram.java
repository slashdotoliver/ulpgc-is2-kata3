package software.ulpgc.kata3.model.entities;

import java.util.List;

public interface Histogram {

    String title();

    List<String> labels();

    int valueOf(String label);
}
