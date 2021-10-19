package lesson.personal.Balabol;

public class Meeting {
    public String meetUser(boolean wasGreeting, String name) {
        if (wasGreeting) {
            return "Ow " + name + "! Hello here again!";
        }
        return "Hey " + name + "! Hello! I'm BalaBall";
    }
}
