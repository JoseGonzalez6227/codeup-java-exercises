import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {


        // Hero and Monster Variables

        int heroHealth = 100;
        int monsterHealth = 100;
        int monsterPower = 10;
        int heroPower = 10;
        int Potion = 3;
        int monsterPotion = 3;
        int Potion2 = 2;

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome Hero! \uD83E\uDDD9\u200D What is your name?");
        String name = scanner.next();
        System.out.println("Pleasure to meet you " + name + "! " + "\uD83E\uDDDD\u200D️ ");
        String stats = ("\uD83D\uDC32"+"Monster Dragon"+"\uD83D\uDC32\n" +
                "monsterHealth:❤️ " + monsterHealth + "\n" +
                "monsterPower:\uD83D\uDCA5 " + monsterPower + "\n" +
                "Potion:\uD83E\uDDEA " + monsterPotion + "\n" +
                "/////////////////////\n" +
                "\uD83E\uDDB8\u200D️"+"Hero"+"\uD83E\uDDB8\u200D\n️" +
                "heroHealth:❤️ " + heroHealth + "\n" +
                "heroPower:\uD83D\uDCA5 " + heroPower + "\n" +
                "Potion:" + Potion +"\uD83E\uDDEA");

        System.out.println("Wanna play [y/n]? \uD83D\uDE43 ");
        String userInput = scanner.next();

        if (userInput.contains("yes")) {
            System.out.println("Are you sure[y/n]? \uD83D\uDC40");
            String response = scanner.next();
            if (response.contains("yes")) {
                System.out.println("Okay!!!");
                System.out.print("/////////////////////\n");
                System.out.println("Welcome to the Game, Your Enemy is Monster Dragon!");
                System.out.print("/////////////////////\n");
                System.out.println(stats);
                System.out.println("Ready [y/n]? \uD83D\uDE0E ");
                String ready = scanner.next();

                if (ready.contains("yes")) {
                    System.out.println("\uD83C\uDF8A" + "Fight!" + "\uD83C\uDF8A\n");
                }

                    System.out.println("Make a move:");
                    System.out.println(" 1. RoundHouse Kick to the Face");
                    System.out.println(" 2. Run in Shame");
                    System.out.println(" 3. Drink Potion");
                    System.out.println(": ");


                int action = scanner.nextInt();
//                FIRST CHOICE CODE

                if (action == 1) {
                    monsterHealth -= 90;
                    System.out.println("ROUND HOUSE ACTIVATED!" + "\uD83E\uDDB5\uD83D\uDCA5" + " 90% Health has been removed from Monster Dragon! ");
                    String stats1 = ("Monster\n" +
                            "monsterHealth: " + monsterHealth + "❤\n" +
                            "monsterPower: " + monsterPower + "\uD83D\uDCA5\n" +
                            "Potion: " + monsterPotion + "\uD83E\uDDEA\n" +
                            "/////////////////////\n" +
                            "Hero(You)\n" +
                            "heroHealth: " + heroHealth + "❤\n" +
                            "heroPower: " + heroPower + "\uD83D\uDCA5\n\n" +
                            "Potion: " + Potion + "\uD83E\uDDEA");

                    System.out.println(stats1);
                    System.out.println("AUTOMATIC !!DQ!!");
                    System.out.println("\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6" + "YOU WIN" + "\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6");
                }
//                SECOND CHOICE CODE
                if (action == 2) {
                    System.out.println("You have been shamed!");
                    System.out.println("\uD83D\uDC4D\uD83D\uDD95\uD83D\uDC4D\uD83D\uDD95" + "GAME OVER LOSER" + "\uD83D\uDC4D\uD83D\uDD95\uD83D\uDC4D\uD83D\uDD95");
                }
//                THIRD CHOICE CODE
                if (action == 3) {
                    heroHealth += 10;
                    String stats2 = ("Monster\n" +
                            "monsterHealth: " + monsterHealth + "❤\n" +
                            "monsterPower: " + monsterPower + "\uD83D\uDCA5\n" +
                            "Potion: " + monsterPotion + "\uD83E\uDDEA\n" +
                            "/////////////////////\n" +
                            "Hero(You)\n" +
                            "heroHealth: " + heroHealth + "❤\n" +
                            "heroPower: " + heroPower + "\uD83D\uDCA5\n\n" +
                            "Potion: " + Potion2 + "\uD83E\uDDEA");
                    System.out.println(stats2);
                }
            }
        }
    }
}
