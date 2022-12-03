package by.tms.seasons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Season {
    private SeasonType seasonType;

    private SeasonType myFavoriteSeason;

    public void infoAboutFavoriteSeason() {
        System.out.println("Мой любимый сезон " + myFavoriteSeason);
    }

    public void infoAboutSeason(SeasonType seasonType) {
        switch (seasonType) {
            case WINTER -> System.out.println("Я люблю Зиму!");
            case SPRING -> System.out.println("Я люблю Весну!");
            case SUMMER -> System.out.println("Я люблю Лето!");
            case AUTUMN -> System.out.println("Я люблю Осень!");

        }
    }
}
