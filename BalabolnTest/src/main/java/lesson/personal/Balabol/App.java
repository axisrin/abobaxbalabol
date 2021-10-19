package lesson.personal.Balabol;

import java.util.Scanner;

public class App {

    public String userName;
    public static Scanner scanner = new Scanner(System.in);
    public boolean wasGreeting;
    private String userText;

    public void runApp() {
        wasGreeting = false;
        System.out.println("What's your name?");
        userName = scanner.nextLine();

        String meetingText;
        Meeting meeting = new Meeting();

        meetingText = meeting.meetUser(wasGreeting, userName);
        System.out.println(meetingText);

        Talking talking = new Talking();
        userText = "start";
        System.out.println("Sign your message...");

        while (!userText.toLowerCase().equals("stop")) {
            userText = scanner.nextLine();
            System.out.println(talking.answer(userText));
            System.out.println("Sign your message...");
        }
    }

}
