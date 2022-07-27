package day11_practice_tasks;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
        String result = "";
        switch(browser) {
            case "CHROME":     case "chrome":    case"Chrome":
                result = "Chrome is openning";
                break;
            case "FIREFOX":    case "firefox":  case "Firefox":
                result = "Firefox is openning";
                break;
            case "OPERA":      case "opera":    case "Opera":
                result = "Opera is openning";
                break;
            case "SAFARI":     case "safari":   case "Safari":
                result = "Safari is openning";
                break;
            case "INTERNET EXPLORER":    case "internet explorer":     case "Internet Explorer":
                result = "Internet Explorer is openning";
                break;
            default:
                result = browser + "is not valid";
        }
        System.out.println(result);
        /*        write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers'
            names, out put should be: Invalid Browser
        	Do Not use if statement or ternary
         */






    }
}
