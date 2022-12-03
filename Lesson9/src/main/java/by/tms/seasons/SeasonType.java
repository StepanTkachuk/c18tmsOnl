package by.tms.seasons;

public enum SeasonType {
    WINTER(0),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(15);
    int averageTemp;


    public String getDescription() {
        return "Холодное время года";
    }


    SeasonType(int averageTemp) {
        this.averageTemp = averageTemp;
    }
}
