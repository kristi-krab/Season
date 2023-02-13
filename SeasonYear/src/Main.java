public class Main {
    public static void main(String[] args){
        Season SeasonYear = new Season();
        Season.loveSeason(Season.season.SUMMER);
        System.out.println("мое любимое время года: "+ SeasonYear.loveSeason +", это "+SeasonYear.loveSeason.getDescription()+" со средней температурой - "+SeasonYear.loveSeason.Temp);
        System.out.println();
        SeasonYear.getEnum();
    }
}
