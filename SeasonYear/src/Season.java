public class Season {
    enum season{
        WINTER(-23), SPRING(12), AUTUMN(9),
        SUMMER(26){
            public String getDescription() {
                return "Теплое время года";
            }
        };
        int Temp;
        season(int temp){
            this.Temp = temp;
        }
        public String getDescription() {
            return "Холодное время года";
        }
    }
    public season loveSeason = season.SUMMER;
    public static void loveSeason(season time_season){
        switch (time_season) {
            case WINTER -> System.out.println("Я люблю зиму!");
            case SPRING -> System.out.println("Я люблю весну!");
            case SUMMER -> System.out.println("Я люблю лето!");
            case AUTUMN -> System.out.println("Я люблю осень!");
        }
    }
    public void getEnum(){
        for (season seasons : season.values()){
            System.out.println(seasons);
            System.out.println(seasons.Temp);
            System.out.println(seasons.getDescription());
            System.out.print("\n");
        }
    }

}


