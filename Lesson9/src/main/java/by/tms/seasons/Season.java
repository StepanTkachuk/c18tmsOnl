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
            case ЗИМА -> System.out.println("Я люблю Зиму!");
            case ВЕСНА -> System.out.println("Я люблю Весну!");
            case ЛЕТО -> System.out.println("Я люблю Лето!");
            case ОСЕНЬ -> System.out.println("Я люблю Осень!");

        }
    }
}
