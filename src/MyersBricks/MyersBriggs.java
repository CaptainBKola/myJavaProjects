package MyersBricks;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] extroversionQuestions = new String[5][2];
        String[][] sensingQuestions = new String[5][2];
        String[][] thinkingQuestions = new String[5][2];
        String[][] judgingQuestions = new String[5][2];

        extroversionQuestions[0][0] = "expend energy, enjoy groups";
        extroversionQuestions[0][1] = "conserve energy, enjoy one-on-one";
        extroversionQuestions[1][0] = "more outgoing, think out loud";
        extroversionQuestions[1][1] = "more reserved, think to yourself";
        extroversionQuestions[2][0] = "seek many tasks, public activities, interaction with others";
        extroversionQuestions[2][1] = "seek private, solitary activities with quiet to concentrate";
        extroversionQuestions[3][0] = "external, communicative, express yourself";
        extroversionQuestions[3][1] = "internal, reticent, keep to yourself";
        extroversionQuestions[4][0] = "active, initiate";
        extroversionQuestions[4][1] = "reflective, deliberate";

        sensingQuestions[0][0] = "interpret literally";
        sensingQuestions[0][1] = "look for meaning and possibilities";
        sensingQuestions[1][0] = "practical, realistic, experiential";
        sensingQuestions[1][1] = "imaginative, innovative, theoretical";
        sensingQuestions[2][0] = "standard, usual, conventional";
        sensingQuestions[2][1] = "different, novel, unique";
        sensingQuestions[3][0] = "focus on here-and-now";
        sensingQuestions[3][1] = "look to the future, global perspective, \"big picture\"";
        sensingQuestions[4][0] = "facts, things, \"what is\"";
        sensingQuestions[4][1] = "ideas, dreams, \"what could be,\" philosophical";

        thinkingQuestions[0][0] = "logical, thinking, questioning";
        thinkingQuestions[0][1] = "empathetic, feeling, accommodating";
        thinkingQuestions[1][0] = "candid, straight forward, frank";
        thinkingQuestions[1][1] = "tactful, kind, encouraging";
        thinkingQuestions[2][0] = "firm, tend to criticize, hold the line";
        thinkingQuestions[2][1] = "gentle, tend to appreciate, conciliate";
        thinkingQuestions[3][0] = "tough-minded, just";
        thinkingQuestions[3][1] = "tender-hearted, merciful";
        thinkingQuestions[4][0] = "matter of fact, issue-oriented";
        thinkingQuestions[4][1] = "sensitive, people-oriented, compassionate";

        judgingQuestions[0][0] = "organized, orderly";
        judgingQuestions[0][1] = "flexible, adaptable";
        judgingQuestions[1][0] = "plan, schedule";
        judgingQuestions[1][1] = "unplanned, spontaneous";
        judgingQuestions[2][0] = "regulated, structured”";
        judgingQuestions[2][1] = "easygoing, “live” and “let live”";
        judgingQuestions[3][0] = "preparation, plan ahead";
        judgingQuestions[3][1] = "go with the flow, adapt as you go";
        judgingQuestions[4][0] = "control, govern";
        judgingQuestions[4][1] = "latitude, freedom";

        int[] extroversion = new int[5];
        int[] sensing = new int[5];
        int[] thinking = new int[5];
        int[] judging = new int[5];

        StringBuilder result = new StringBuilder();
        int questionNumber = 1;
        for (int i = 0; i < extroversionQuestions.length; i++) {
            System.out.printf("Question %d%n", questionNumber++);
            System.out.println("A. " + extroversionQuestions[i][0]);
            System.out.println("B. " + extroversionQuestions[i][1]);
            System.out.println("Pick an option: A or B");
            String option = getOption(scanner);
            if(option.equalsIgnoreCase("A")) extroversion[i] = 1;

            System.out.printf("Question %d%n", questionNumber++);
            System.out.println("A. " + sensingQuestions[i][0]);
            System.out.println("B. " + sensingQuestions[i][1]);
            System.out.println("Pick an option: A or B");
            option = getOption(scanner);
            if(option.equalsIgnoreCase("A")) sensing[i] = 1;

            System.out.printf("Question %d%n", questionNumber++);
            System.out.println("A. " + thinkingQuestions[i][0]);
            System.out.println("B. " + thinkingQuestions[i][1]);
            System.out.println("Pick an option: A or B");
            option = getOption(scanner);
            System.out.printf("Question %d%n", questionNumber++);
            if(option.equalsIgnoreCase("A")) thinking[i] = 1;

            System.out.println("A. " + judgingQuestions[i][0]);
            System.out.println("B. " + judgingQuestions[i][1]);
            System.out.println("Pick an option: A or B");
            option = getOption(scanner);
            if(option.equalsIgnoreCase("A")) judging[i] = 1;

        }

        System.out.println("\nYour choice at a glance\n");
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B",
                " ", "A", "B", " ", "A", "B", " ", "A", "B");
        System.out.printf("%s%n", "-".repeat(74));
        questionNumber = 1;
        for (int i = 0; i < extroversion.length; i++) {
            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", questionNumber++, placeCheckmark(extroversion[i], 1), placeCheckmark(extroversion[i], 2),
                    questionNumber++, placeCheckmark(sensing[i], 1), placeCheckmark(sensing[i], 2), questionNumber++,
                    placeCheckmark(thinking[i], 1), placeCheckmark(thinking[i], 2), questionNumber++,
                    placeCheckmark(judging[i], 1), placeCheckmark(judging[i], 2));
        }
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL", countNumbers(extroversion, 1), countNumbers(extroversion, 0),
                " ", countNumbers(sensing, 1), countNumbers(sensing, 0), " ", countNumbers(thinking, 1), countNumbers(thinking, 0), " ", countNumbers(judging, 1), countNumbers(judging, 0));
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "E", "I",
                " ", "S", "N", " ", "T", "F", " ", "J", "P");

        if(sum(extroversion) < 3){
            result.append("I");
        }else {
            result.append("E");
        }

        if(sum(sensing) < 3){
            result.append("N");
        }else {
            result.append("S");
        }

        if(sum(thinking) < 3){
            result.append("F");
        }else {
            result.append("T");
        }

        if(sum(judging) < 3){
            result.append("P");
        }else {
            result.append("J");
        }

        System.out.println("Your personality type is " + result);
        System.out.print("For your personality interpretation, visit : ");
        System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");
    }

    public static int sum(int[] intArrays){
        int sum = 0;
        for(int number : intArrays) sum += number;
        return sum;
    }

    public static String placeCheckmark(int num, int position){
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
    }

    public static int countNumbers(int[] numArray, int number){
        int count = 0;
        for(int num : numArray){
            if(num == number) count++;
        }
        return count;
    }

    public static String getOptionAOrB(String option){
        if(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("B")){
            return option;
        }else {
            throw new IllegalArgumentException("Wrong choice; choose A or B");
        }
    }
    public static String getOption(Scanner scanner){
        String option;
        while (true){
            try {
                option = getOptionAOrB(scanner.nextLine());
                return option;
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }

        }
    }
}
