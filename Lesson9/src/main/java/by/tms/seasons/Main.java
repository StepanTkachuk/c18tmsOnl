package by.tms.seasons;

import static by.tms.seasons.SeasonType.*;

public class Main {

    public static void main(String[] args) {
        Season season = new Season();
        season.setMyFavoriteSeason(SPRING);
        season.infoAboutFavoriteSeason();
        season.infoAboutSeason(SUMMER);
        season.infoAboutSeason(WINTER);
        season.setSeasonType(SUMMER);
        System.out.println(season.getSeasonType().getDescription());
        season.setSeasonType(WINTER);
        System.out.println(season.getSeasonType().getDescription());
        for (SeasonType seasonType : values()) {
            System.out.println(seasonType + "\n" + seasonType.averageTemp + "\n" + seasonType.getDescription());
        }
    }
}
