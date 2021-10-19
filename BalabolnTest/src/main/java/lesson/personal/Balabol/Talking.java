package lesson.personal.Balabol;

import java.util.Scanner;

public class Talking {

    public int isAnsweredDela = 0;
    public int countAnswersDela = 0;
    Scanner scanner = new Scanner(System.in);

    public String answer(String userMessage) {
        if (userMessage.contains("дела") && countAnswersDela < 1) {
            System.out.println("Are you sure want to know how im doin?");
            boolean sure;
            sure = scanner.nextBoolean();
            if (sure) {
                isAnsweredDela++;
                countAnswersDela = 0;
                return howAreYou(isAnsweredDela);
            }
            countAnswersDela++;
        }
        else if (userMessage.contains("дела") && countAnswersDela < 2) {
            System.out.println("Are you want to know which deals you have?");
            boolean sure;
            sure = scanner.nextBoolean();
            if (sure) {
                countAnswersDela = 0;
                return todoList();
            }
            countAnswersDela++;
        }
        return "Sorry i haven't more options!";
    }

    public String howAreYou(int isAnsweredDela) {
        if (isAnsweredDela >= 2 && isAnsweredDela <= 5)
            return "It's still okey.....";
        if (isAnsweredDela > 5)
            return "......";
        return "Thanks! I'm okey! How are you? Choose 1 or 0 (good or bad)";
    }

    public String todoList() {
        return "Now is tothing added!";
    }
}
