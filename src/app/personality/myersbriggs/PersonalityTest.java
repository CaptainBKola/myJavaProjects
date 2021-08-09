
package app.personality.myersbriggs;

import java.util.Scanner;


public class PersonalityTest {
    static int questionNumber = 1;

    public static void main(String[] args) {

        String[] extroversionVsIntroversionTest = {
                "A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one",
                "A. more outgoing, think out loud. B. more reserved, think to yourself",
                "A. seek many tasks, public activities, interaction with others. " +
                        "B. seek private solitary activities with quiet to concentrate",
                "A. external, communicative,  express yourself. B. internal, reticent, keep to yourself",
                "A. active, initiate. B. reflective, deliberate"};

        String[] sensingVsIntuitionTest = {
                "A. interpret literally. B. look for meaning and possibilities",
                "A. practical, realistic, experiential. B. imaginative, innovative, theoretical",
                "A. standard, usual, conventional. B. different, novel, unique",
                "A. focus on here-and-now\" .B.look to the future, global perspective, \"big picture\"",
                "A. facts, things, \"what is\". B. ideas, dreams, \"what could be,\" philosophical"
        };


        String[] thinkingVsFeelingTest = {
                "A. logical, thinking, questioning. B. empathetic, feeling, accommodating",
                "A. candid, straight forward, frank. B.tactful, kind, encouraging",
                "A. firm, tend to criticize, hold the line. B. gentle, tend to appreciate, conciliate",
                "A. tough-minded, just B.tender-hearted, merciful",
                "A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate",
        };

        String[] judgingVsPerceivingTest = {
                "A. organized, orderly. B. flexible, adaptable",
                "A. plan, schedule B. unplanned, spontaneous",
                "A. regulated, structured B. easygoing, “live\" and “let live\"",
                "A. preparation, plan ahead. B. go with the flow, adapt as you go",
                "A. control, govern B. latitude, freedom"};


        int[] extrovertVsIntrovertAnswersStorage = new int[5];
        int[] sensingVsIntuitionsAnswersStorage = new int[5];
        int[] thinkingVsFeelingAnswersStorage = new int[5];
        int[] judgingVsPerceivingAnswersStorage = new int[5];

        StringBuilder result = new StringBuilder();

        // serves questions, collects strings saves answer into second array as int
        // letter option A is represented as digit 1 while option B is represented as digit 0.

            iterate(extroversionVsIntroversionTest,extrovertVsIntrovertAnswersStorage);
            iterate(sensingVsIntuitionTest,sensingVsIntuitionsAnswersStorage);
            iterate(thinkingVsFeelingTest,thinkingVsFeelingAnswersStorage);
            iterate(judgingVsPerceivingTest,judgingVsPerceivingAnswersStorage);

//sum number of As and Bs
            int sumOfAsInExtroversion = sum(extrovertVsIntrovertAnswersStorage);
            int sumOfAsInSensing = sum(sensingVsIntuitionsAnswersStorage);
            int sumOfAsInThinking = sum(thinkingVsFeelingAnswersStorage);
            int sumOfAsInJudging = sum(judgingVsPerceivingAnswersStorage);


            // append personality type accordingly
            if (sumOfAsInExtroversion < 3) result.append("I");
            else {
                result.append("E");
            }

            if (sumOfAsInSensing < 3) result.append("N");
            else {
                result.append("S");
            }

            if (sumOfAsInThinking < 3) result.append("F");
            else {
                result.append("T");
            }

            if(sumOfAsInJudging < 3) result.append("P");
            else{
                result.append("J");
            }


            // print personality results in a table.
        System.out.println("\nYour choice at a glance\n");
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B",
                " ", "A", "B", " ", "A", "B", " ", "A", "B");
        int numbering = 1;
        System.out.printf("%s%n", "-".repeat(74));
        for (int i = 0; i< extrovertVsIntrovertAnswersStorage.length; i++) {
            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", numbering++,
                    placeCheckmark(extrovertVsIntrovertAnswersStorage[i],1),
                    placeCheckmark(extrovertVsIntrovertAnswersStorage[i], 2),
                    numbering++, placeCheckmark(sensingVsIntuitionsAnswersStorage[i], 1),
                    placeCheckmark(sensingVsIntuitionsAnswersStorage[i], 2),
                    numbering++,
                    placeCheckmark(thinkingVsFeelingAnswersStorage[i], 1),
                    placeCheckmark(thinkingVsFeelingAnswersStorage[i], 2), numbering++,
                    placeCheckmark(judgingVsPerceivingAnswersStorage[i], 1),
                    placeCheckmark(judgingVsPerceivingAnswersStorage[i], 2));
        }

        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL",
                countNumbers(extrovertVsIntrovertAnswersStorage, 1), countNumbers(extrovertVsIntrovertAnswersStorage, 0),
                " ", countNumbers(sensingVsIntuitionsAnswersStorage, 1), countNumbers(sensingVsIntuitionsAnswersStorage, 0), " ",
                countNumbers(thinkingVsFeelingAnswersStorage, 1),
                countNumbers(thinkingVsFeelingAnswersStorage, 0), " ",
                countNumbers(judgingVsPerceivingAnswersStorage, 1), countNumbers(judgingVsPerceivingAnswersStorage, 0));
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "E", "I",
                " ", "S", "N", " ", "T", "F", " ", "J", "P");

        System.out.println("Your personality type is " + result);
        System.out.print("For your personality interpretation, visit : ");
        System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");

    }



    public static String placeCheckmark(int num, int position){
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
    }



   public static void iterate(String[] questions, int[] answers) {

       Scanner scanner = new Scanner(System.in);
        String optionAorB;
        for (int number = 0; number < questions.length; number++) {
           System.out.printf("Question %d%n", questionNumber++);
           System.out.println(questions[number]);
           System.out.println("Pick an option: A or B");
           optionAorB = getOption(scanner);
           if ((optionAorB.equalsIgnoreCase("A"))){
               answers[number] = 1;
           }
       }
   }



    public static int sum(int[] intArrays){
        int sum = 0;
        for(int number : intArrays) sum += number;
         return sum;
    }


    public static int countNumbers(int[] numArray, int number){
        int count = 0;
        for(int num : numArray){
            if(num == number) count++;
        }
        return count;
    }


    public static String getOption(Scanner input){
        String option;
        while (true){
            try {
                option = input.nextLine();
                if(option.trim().equalsIgnoreCase("A".trim()) || option.trim().equalsIgnoreCase("B".trim())){
                    return option;
                }else {
                    throw new IllegalArgumentException("Wrong choice; choose A or B");
                }
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }
        }
    }


}









































