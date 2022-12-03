package by.tms.seasons;

public enum SeasonType {
    ЗИМА(0),
    ВЕСНА(10),
    ЛЕТО(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    ОСЕНЬ(15);
    int averageTemp;


    public String getDescription() {
        return "Холодное время года";
    }


    SeasonType(int averageTemp) {
        this.averageTemp = averageTemp;
    }
}
