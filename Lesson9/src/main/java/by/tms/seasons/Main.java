package by.tms.seasons;

public class Main {

    public static void main(String[] args) {
        Season season = new Season();
        season.setMyFavoriteSeason(SeasonType.ВЕСНА);
        season.infoAboutFavoriteSeason();
        season.infoAboutSeason(SeasonType.ЛЕТО);
        season.infoAboutSeason(SeasonType.ЗИМА);
        season.setSeasonType(SeasonType.ЛЕТО);
        System.out.println(season.getSeasonType().getDescription());
        season.setSeasonType(SeasonType.ЗИМА);
        System.out.println(season.getSeasonType().getDescription());
        for (SeasonType seasonType : SeasonType.values()) {
            System.out.println(seasonType + "\n" + seasonType.averageTemp + "\n" + seasonType.getDescription());
        }
    }
}
