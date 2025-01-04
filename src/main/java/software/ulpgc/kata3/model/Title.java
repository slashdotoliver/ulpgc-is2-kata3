package software.ulpgc.kata3.model;

import java.time.Duration;
import java.time.Year;
import java.util.List;
import java.util.Optional;

public record Title(
        String id,
        TitleType type,
        String primaryTitle,
        String originalTitle,
        boolean isAdult,
        Optional<Year> startYear,
        Optional<Year> endYear,
        Optional<Duration> runtimeDuration,
        List<Genre> genres
) {

    public enum Genre {
        ADULT,
        ADVENTURE,
        ANIMATION,
        BIOGRAPHY,
        COMEDY,
        CRIME,
        DOCUMENTARY,
        FANTASY,
        FAMILY,
        HISTORY,
        HORROR,
        MUSIC,
        MUSICAL,
        MYSTERY,
        NEWS,
        ROMANCE,
        SPORT,
        THRILLER,
        WAR,
        WESTERN,
        DRAMA,
        SHORT,
        ACTION,
        GAME_SHOW,
        SCI_FI,
        TALK_SHOW,
    }

    public enum TitleType {
        MOVIE,
        SHORT,
    }
}
