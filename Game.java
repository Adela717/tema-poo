import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Game{
    public Grid grid;
    ArrayList<Account> accounts;

    public void printAccounts() {
        for (Account account : accounts) {
            Account.Information info = account.getInformation();
            System.out.println("Name: " + info.getName());
            System.out.println("Country: " + info.getCountry());
            System.out.println("Favorite Games: " + info.getFavoriteGames());
            System.out.println("Maps Completed: " + account.getMapsCompleted());
            for (Character character : account.getCharacters()) {
                System.out.println("Character Name: " + character.getName());
                System.out.println("Profession: " + character.getProfession());
                System.out.println("Level: " + character.getLevel());
                System.out.println("Experience: " + character.getExperience());
            }
            System.out.println();
        }
    }

    public Game() {
        this.grid = Grid.generateMap(6, 6);
        this.accounts = createAccounts();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public ArrayList<Account> createAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();

        // Account 1
        Credentials credentials1 = new Credentials("marcel", "mar");
        SortedSet<String> favoriteGames1 = new TreeSet<>();
        favoriteGames1.add("Metin");
        favoriteGames1.add("4Story");
        ArrayList<Character> characters1 = new ArrayList<>();
        characters1.add(new Warrior("Odysseus Prisco", 15, 1));
        characters1.add(new Mage("Kameron Neppl", 10, 1));
        Account.Information information1 = new Account.Information(credentials1, favoriteGames1, "Marcel", "Romania");
        Account account1 = new Account(characters1, 15, information1);
        accounts.add(account1);

        // Account 2
        Credentials credentials2 = new Credentials("sebi", "sebi");
        SortedSet<String> favoriteGames2 = new TreeSet<>();
        favoriteGames2.add("Counter Strike 1.6");
        favoriteGames2.add("GTA V");
        favoriteGames2.add("Metin 2");
        ArrayList<Character> characters2 = new ArrayList<>();
        characters2.add(new Rogue("Hisa Hano", 20, 2));
        characters2.add(new Mage("Rina Zanin", 0, 2));
        Account.Information information2 = new Account.Information(credentials2, favoriteGames2, "Sanjiv Bénédicte", "India");
        Account account2 = new Account(characters2, 60, information2);
        accounts.add(account2);

        // Add more accounts as needed based on the JSON structure

        return accounts;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your username:");
        String command = scanner.nextLine();

        for (Account account : accounts) {
            Account.Information info = account.getInformation();
            Credentials creds = info.getCredentials();
            String em = creds.getEmail();
            String pas = creds.getPassword();

            if(command.equals(em)) {
                System.out.println("Introduce your password:");
                while(true) {
                    String command2 = scanner.nextLine();
                    if(command2.equals(pas)) {
                        System.out.println("You're in!!");
                        break;
                    }
                }
            }
        }

        
        //clearScreen();
        //printAccounts();
        System.out.println("Enter movement commands (north, south, west, east). Type 'exit' to quit.");
        grid.printGrid();

        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("x")) {
                break;
            }

            try {
                switch (command) {
                    case "n":
                        grid.goNorth();
                        clearScreen();
                        grid.printGrid();
                        break;
                    case "s":
                        grid.goSouth();
                        clearScreen();
                        grid.printGrid();
                        break;
                    case "w":
                        grid.goWest();
                        clearScreen();
                        grid.printGrid();
                        break;
                    case "e":
                        grid.goEast();
                        clearScreen();
                        grid.printGrid();
                        break;
                    default:
                        System.out.println("Invalid command. Please enter north, south, west, or east.");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}