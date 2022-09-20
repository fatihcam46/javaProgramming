package day51_Map;
//Browser Enuma bak>>>
public class TestEnum {
    public static void main(String[] args) {

        //   String browser = "Wooden Spoon";//Browser a ne yazildiysa o gecer
        Browser browser = Browser.SAFARI;

        switch (browser) {
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }

//Safari is selected
        System.out.println("-------------------");
        Season season = Season.SUMMER;//looking /season Enum a
        System.out.println("season = " + season);//season = SUMMER

        System.out.println("-------------------");
        Level level = Level.HARD;//looking /level Enum a
        System.out.println("level = " + level);//level = HARD
    }
}
