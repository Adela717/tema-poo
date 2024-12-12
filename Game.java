import java.util.*;

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
        Random rand = new Random();
        int randomLength = 5 + rand.nextInt(4);
        int randomWidth = 5 + rand.nextInt(4);
        this.grid = Grid.generateHardcodedMap();
        this.accounts = createAccounts();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public ArrayList<Account> createAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        
        // Account 1
        Credentials credentials1 = new Credentials("marcel@yahoo.com", "6K7GUxjsAc");
        SortedSet<String> favoriteGames1 = new TreeSet<>();
        favoriteGames1.add("Metin");
        favoriteGames1.add("4Story");
        ArrayList<Character> characters1 = new ArrayList<>();
        characters1.add(new Warrior("Odysseus Prisco", 15, 1));
        characters1.add(new Mage("Kameron Neppl", 10, 1));
        characters1.add(new Rogue("Chlarimonde Markert", 35, 1));
        Account.Information information1 = new Account.Information(credentials1, favoriteGames1, "Marcel", "Romania");
        Account account1 = new Account(characters1, 15, information1);
        accounts.add(account1);

        // Account 2
        Credentials credentials2 = new Credentials("genna1951@hotmail.red", "123456");
        SortedSet<String> favoriteGames2 = new TreeSet<>();
        favoriteGames2.add("World of Warcraft");
        favoriteGames2.add("Metin2");
        favoriteGames2.add("Need for Speed");
        ArrayList<Character> characters2 = new ArrayList<>();
        characters2.add(new Warrior("Brisco Schaab", 21, 4));
        characters2.add(new Mage("Scarlett Gardon", 50, 7));
        characters2.add(new Rogue("Miyoko Fei", 40, 15));
        Account.Information information2 = new Account.Information(credentials2, favoriteGames2, "Nawra Ortwin", "Turkey");
        Account account2 = new Account(characters2, 3, information2);
        accounts.add(account2);

        // Account 3
        Credentials credentials3 = new Credentials("mculrad0586@perirh.com", "aTtZWI7SDl");
        SortedSet<String> favoriteGames3 = new TreeSet<>();
        favoriteGames3.add("Metin");
        favoriteGames3.add("4Story");
        ArrayList<Character> characters3 = new ArrayList<>();
        characters3.add(new Warrior("Fujio Takeshita", 15, 12));
        characters3.add(new Mage("Briareus Prestia", 10, 5));
        characters3.add(new Rogue("Kame Oda", 5, 11));
        Account.Information information3 = new Account.Information(credentials3, favoriteGames3, "Gemma Eusebius", "France");
        Account account3 = new Account(characters3, 1, information3);
        accounts.add(account3);

        // Account 4
        Credentials credentials4 = new Credentials("kdsinc@o0i.es", "bxSvxYcaoD");
        SortedSet<String> favoriteGames4 = new TreeSet<>();
        favoriteGames4.add("Metin");
        favoriteGames4.add("4Story");
        ArrayList<Character> characters4 = new ArrayList<>();
        characters4.add(new Warrior("Fedele Sama", 20, 10));
        characters4.add(new Mage("Jannik Wriedt", 0, 1));
        characters4.add(new Rogue("Hisa Hano", 20, 2));
        Account.Information information4 = new Account.Information(credentials4, favoriteGames4, "Grimwald Marciane", "United Kingdom");
        Account account4 = new Account(characters4, 20, information4);
        accounts.add(account4);

        // Account 5
        Credentials credentials5 = new Credentials("dd55avid@lited.site", "L5PN1Qknrn");
        SortedSet<String> favoriteGames5 = new TreeSet<>();
        favoriteGames5.add("Counter Strike 1.6");
        favoriteGames5.add("GTA V");
        favoriteGames5.add("Metin 2");
        ArrayList<Character> characters5 = new ArrayList<>();
        characters5.add(new Warrior("Rina Zanin", 4, 3));
        characters5.add(new Mage("Dyana Inselman", 10, 5));
        characters5.add(new Rogue("Uysal Abdallah", 45, 7));
        Account.Information information5 = new Account.Information(credentials5, favoriteGames5, "Sanjiv Bénédicte", "India");
        Account account5 = new Account(characters5, 60, information5);
        accounts.add(account5);

        // Account 6
        Credentials credentials6 = new Credentials("troydealbaby@eoooodid.com", "nhnn0HXi8q");
        SortedSet<String> favoriteGames6 = new TreeSet<>();
        favoriteGames6.add("Metin 2");
        favoriteGames6.add("League of Legends");
        ArrayList<Character> characters6 = new ArrayList<>();
        characters6.add(new Warrior("Silvain Spilker", 0, 8));
        characters6.add(new Mage("Thibaut Goy", 3, 10));
        characters6.add(new Rogue("Eyup Uner", 3, 2));
        Account.Information information6 = new Account.Information(credentials6, favoriteGames6, "Praveena Yevheniy", "Romania");
        Account account6 = new Account(characters6, 10, information6);
        accounts.add(account6);

        // Account 7
        Credentials credentials7 = new Credentials("al6056@keralaairport.net", "fBfQbuDm8Z");
        SortedSet<String> favoriteGames7 = new TreeSet<>();
        favoriteGames7.add("Lego Lord of the Rings");
        favoriteGames7.add("Guild Wars 2");
        ArrayList<Character> characters7 = new ArrayList<>();
        characters7.add(new Warrior("Jaiden Kimmich", 1, 10));
        characters7.add(new Mage("Zain Eiden", 2, 7));
        characters7.add(new Rogue("Crocefissa Smeriglio", 5, 11));
        Account.Information information7 = new Account.Information(credentials7, favoriteGames7, "Victor Madhuri", "Bulgaria");
        Account account7 = new Account(characters7, 3, information7);
        accounts.add(account7);

        // Account 8
        Credentials credentials8 = new Credentials("roschsin@epubp.site", "AtprqBw5np");
        SortedSet<String> favoriteGames8 = new TreeSet<>();
        favoriteGames8.add("Batman Arkham Knight");
        favoriteGames8.add("Batman Arkham Asylum");
        ArrayList<Character> characters8 = new ArrayList<>();
        characters8.add(new Warrior("Fiona Broussard", 2, 20));
        characters8.add(new Mage("Fjodora Schutzman", 3, 15));
        characters8.add(new Rogue("Shigeru Uno", 10, 6));
        Account.Information information8 = new Account.Information(credentials8, favoriteGames8, "Stuart Dorofei", "Romania");
        Account account8 = new Account(characters8, 13, information8);
        accounts.add(account8);

        return accounts;
    }

    public void run() {
        clearScreen();
        System.out.println("\033[1;34m   __                                      __   __    __                _                ");
        System.out.println("  / /  ___  __ _  __ _ _   _  ___    ___  / _| / / /\\ \\ \\__ _ _ __ _ __(_) ___  _ __ ___ ");
        System.out.println(" / /  / _ \\/ _` |/ _` | | | |/ _ \\  / _ \\| |_  \\ \\/  \\/ / _` | '__| '__| |/ _ \\| '__/ __|");
        System.out.println("/ /__|  __/ (_| | (_| | |_| |  __/ | (_) |  _|  \\  /\\  / (_| | |  | |  | | (_) | |  \\__ \\");
        System.out.println("\\____/\\___|\\__,_|\\__, |\\__,_|\\___|  \\___/|_|     \\/  \\/ \\__,_|_|  |_|  |_|\\___/|_|  |___/");
        System.out.println("                 |___/                                                                   \033[0m");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[1;30mIntroduce your email:\033[0m");
        String command;
        boolean ok = false;
        Account acc = null;
        Character selectedCharacter = null;
        boolean enemyCanUseAbility = true;
        Spell enemySelectedSpell = null;
        int level = 1;

        while(!ok) {
        System.out.printf("\033[0;36m");
        command = scanner.nextLine();
        System.out.printf("\033[0m");

        for (Account account : accounts) {
            Account.Information info = account.getInformation();
            Credentials creds = info.getCredentials();
            String em = creds.getEmail();
            String pas = creds.getPassword();

            if(command.equals(em)) {
                ok = true;
                System.out.println("\033[1;30mIntroduce your password:\033[0m");
                while(true) {
                    System.out.printf("\033[0;36m");
                    String command2 = scanner.nextLine();
                    System.out.printf("\033[0m");
                    if(command2.equals(pas)) {
                        clearScreen();
                        System.out.println("Choose your character:");
                        acc = account;
                        break;
                    } else {
                        System.out.println("Wrong password");
                    }
                }
            } 
        }
            if(!ok) {
                System.out.println("\033[0;35mWrong username\033[0m");
            }

        }

        int numberCharacter = 1;
        for (Character character : acc.getCharacters()) {
                System.out.println("Option number " + numberCharacter);
                System.out.println("Character Name: " + character.getName());
                System.out.println("Profession: " + character.getProfession());
                System.out.println("Level: " + character.getLevel());
                System.out.println("Experience: " + character.getExperience());
                System.out.println();
                numberCharacter++;
            }

        System.out.println("Your choice:");
        int index = scanner.nextInt();
        int indexAbility;
        scanner.nextLine();

        if(index <= 0 || index > numberCharacter) {
            System.out.println("Wrong index. Character doesn't exist!");
        } else {
            selectedCharacter = acc.getCharacters().get(index - 1);
            System.out.println("You have selected: " + selectedCharacter.getName());
            System.out.println("Press enter to continue");
            command = scanner.nextLine();

            selectedCharacter.setCurrentLife(selectedCharacter.getMaxLife());
            selectedCharacter.setCurrentMana(selectedCharacter.getMaxMana());
        }


        //printAccounts();
        clearScreen();
        System.out.println("Level " + level);
        System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
        grid.printGrid();
        grid.currentCell.setIsVisited();

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
                        break;
                    case "s":
                        grid.goSouth();
                        break;
                    case "w":
                        grid.goWest();
                        break;
                    case "e":
                        grid.goEast();
                        break;
                    default:
                        System.out.println("Invalid command. Please enter north, south, west, or east.");
                }
                clearScreen();
                System.out.println("Level " + level);
                System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                grid.printGrid();
                if(grid.currentCell.cellType == CellEntityType.ENEMY && !grid.currentCell.getIsVisited()) {
                    clearScreen();
                    grid.currentCell.setIsVisited();
                    System.out.println("You have encountered an enemy!");
                    
                    Enemy enemy = new Enemy();
                    System.out.println("Enemy usual damage: " + enemy.getUsualDamage());
                    //System.out.println("Enemy current life: " + enemy.getCurrentLife());
                    //System.out.println("Enemy current mana: " + enemy.getCurrentMana());
                    System.out.println();

                    ArrayList<Spell> enemySpells = new ArrayList<>();
                    ArrayList<Spell> charactersSpells = new ArrayList<>();

                    enemySpells = enemy.getSpells();
                    selectedCharacter.createSpells();
                    charactersSpells = selectedCharacter.getSpells();

                    System.out.println("Enemy spells:");
                    for(Spell spellEnemy : enemySpells) {
                        System.out.println(spellEnemy.toString());
                    }
                    System.out.println();


                    while(enemy.getCurrentLife() > 0 && selectedCharacter.getCurrentLife() > 0) {
                        System.out.println("Press enter to continue");
                        command = scanner.nextLine();
                        clearScreen();
                        System.out.println("Character life: " + selectedCharacter.getCurrentLife());
                        System.out.println("Character mana: " + selectedCharacter.getCurrentMana());
                        System.out.println();

                        System.out.println("Enemy life: " + enemy.getCurrentLife());
                        if(enemy.getCurrentMana() > 0) {
                            System.out.println("Enemy mana: " + enemy.getCurrentMana());
                        } else {
                            System.out.println("Enemy mana: 0");
                        }
                        System.out.println();
                        
                        System.out.println("Press 1 to choose an ability");
                        System.out.println("Press 2 to choose an attack");
                        index = scanner.nextInt();
                        scanner.nextLine();

                        while(index!=1 && index!= 2) {
                            System.out.println("Number is out of range, select another");
                            index = scanner.nextInt();
                            scanner.nextLine();
                        }

                        if(index == 1 && charactersSpells.size() > 0) {
                            System.out.println("Choose an ability");
                            for(int k = 0; k < charactersSpells.size(); k++) {
                                System.out.println((k + 1) + ". " + charactersSpells.get(k).toString());
                            }
                            System.out.println();
                            //System.out.println("You have this much mana: " + selectedCharacter.getCurrentMana());

                            indexAbility = scanner.nextInt();
                            scanner.nextLine();

                            while(indexAbility > charactersSpells.size() + 1 || indexAbility <= 0) {
                            System.out.println("Number is out of range, select another");
                            indexAbility = scanner.nextInt();
                            scanner.nextLine();
                            }

                            System.out.println();
                            System.out.println("You have chosen the following spell:");
                            System.out.println(charactersSpells.get(indexAbility - 1).toString());
                            Spell selectedSpell = charactersSpells.get(indexAbility - 1);
                            System.out.println();

                            boolean canUseAbility = selectedCharacter.useAbility(selectedSpell, enemy);
                            if(canUseAbility) {
                                enemy.receiveDamage(selectedSpell.getDamage());
                            }

                            if(selectedCharacter.getCurrentMana() - selectedSpell.getManaCost() >= 0) {
                                selectedCharacter.setCurrentMana(selectedCharacter.getCurrentMana() - selectedSpell.getManaCost());
                                selectedCharacter.removeSpell(selectedSpell);
                            }

                            System.out.println("Enemy has now " + enemy.getCurrentLife() + " life");
                            System.out.println("Your mana is at " + selectedCharacter.getCurrentMana());
                            System.out.println();


                            if(enemy.getCurrentLife() <= 0) {
                                System.out.println("Congratulations! You have won!");

                                System.out.println("Press enter to continue");
                                command = scanner.nextLine();

                                clearScreen();
                                System.out.println("Level " + level);
                                System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                                grid.printGrid();
                                System.out.println();




                                Random random = new Random();
                                int randomExperiencePoints = 4 + random.nextInt(7);
                                System.out.println("You have received " + randomExperiencePoints + " experience points");

                                selectedCharacter.setExperience(selectedCharacter.getExperience() + randomExperiencePoints);
                                System.out.println("You now have " + selectedCharacter.getExperience() + " experience points");
                                System.out.println();

                                int extraLevel = selectedCharacter.getExperience()/25;
                                int extraCharisma = selectedCharacter.getExperience()/28;
                                int extraDexterity = selectedCharacter.getExperience()/35;
                                int extraStrength = selectedCharacter.getExperience()/26;

                                if(extraLevel >= 1) {
                                    System.out.println("You used to be level " + selectedCharacter.getLevel());
                                    selectedCharacter.setLevel(selectedCharacter.getLevel() + extraLevel);
                                    System.out.println("You now are level " + selectedCharacter.getLevel());
                                    System.out.println();
                                }

                                if(extraCharisma >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getCharisma() + " charisma");
                                    selectedCharacter.setCharisma(selectedCharacter.getCharisma() + extraCharisma);
                                    System.out.println("You now have " + selectedCharacter.getCharisma() + " charisma");
                                    System.out.println();
                                }

                                if(extraDexterity >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getDexterity() + " dexterity");
                                    selectedCharacter.setDexterity(selectedCharacter.getDexterity() + extraDexterity);
                                    System.out.println("You now have " + selectedCharacter.getDexterity() + " dexterity");
                                    System.out.println();
                                }

                                if(extraStrength >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getStrength() + " strength");
                                    selectedCharacter.setStrength(selectedCharacter.getStrength() + extraStrength);
                                    System.out.println("You now have " + selectedCharacter.getStrength() + " strength");
                                    System.out.println();
                                }

                                //System.out.println("Level " + level);
                                //System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                                //grid.printGrid();
                                selectedCharacter.regenerateLife(selectedCharacter.getCurrentLife());
                                selectedCharacter.regenerateMana(selectedCharacter.getMaxMana());
                                break;
                            }
                        } else {
                            if(index == 1) {
                                System.out.println("You have no more spells left");
                            }
                            System.out.println("You are applying a normal attack");
                            int myDamage = selectedCharacter.getDamage();
                            enemy.receiveDamage(myDamage);
                            System.out.println("Enemy has now " + enemy.getCurrentLife() + " life");
                            System.out.println();

                            if(enemy.getCurrentLife() <= 0) {
                                System.out.println("Level " + level);
                                System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                                grid.printGrid();
                                System.out.println();
                                System.out.println("Congratulations! You have won!");
                                Random random = new Random();
                                int randomExperiencePoints = 4 + random.nextInt(7);
                                System.out.println("You have received " + randomExperiencePoints + " experience points");

                                selectedCharacter.setExperience(selectedCharacter.getExperience() + randomExperiencePoints);
                                System.out.println("You now have " + selectedCharacter.getExperience() + " experience points");
                                System.out.println();

                                int extraLevel = selectedCharacter.getExperience()/25;
                                int extraCharisma = selectedCharacter.getExperience()/28;
                                int extraDexterity = selectedCharacter.getExperience()/35;
                                int extraStrength = selectedCharacter.getExperience()/38;

                                if(extraLevel >= 1) {
                                    System.out.println("You used to be level " + selectedCharacter.getLevel());
                                    selectedCharacter.setLevel(selectedCharacter.getLevel() + extraLevel);
                                    System.out.println("You now are level " + selectedCharacter.getLevel());
                                    System.out.println();
                                }

                                if(extraCharisma >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getCharisma() + " charisma");
                                    selectedCharacter.setCharisma(selectedCharacter.getCharisma() + extraCharisma);
                                    System.out.println("You now have " + selectedCharacter.getCharisma() + " charisma");
                                    System.out.println();
                                }

                                if(extraDexterity >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getDexterity() + " dexterity");
                                    selectedCharacter.setDexterity(selectedCharacter.getDexterity() + extraDexterity);
                                    System.out.println("You now have " + selectedCharacter.getDexterity() + " dexterity");
                                    System.out.println();
                                }

                                if(extraStrength >= 1) {
                                    System.out.println("You used to have " + selectedCharacter.getStrength() + " strength");
                                    selectedCharacter.setStrength(selectedCharacter.getStrength() + extraStrength);
                                    System.out.println("You now have " + selectedCharacter.getStrength() + " strength");
                                    System.out.println();
                                }

                                //System.out.println("Level " + level);
                                //System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                                //grid.printGrid();
                                selectedCharacter.regenerateLife(selectedCharacter.getCurrentLife());
                                selectedCharacter.regenerateMana(selectedCharacter.getMaxMana());
                                break;
                            }
                        }

                        Random random = new Random();
                        int enemyAttack = random.nextInt(2);

                        if(enemyAttack == 0 && !enemySpells.isEmpty()) {
                            System.out.println("The enemy has chosen the ability");
                            int enemyAbilityChoice = random.nextInt(enemySpells.size());

                            enemySelectedSpell = enemySpells.get(enemyAbilityChoice);
                            System.out.println(enemySelectedSpell.toString());

                            enemyCanUseAbility = enemy.useAbility(enemySelectedSpell, selectedCharacter);
                            System.out.println();

                            if(enemyCanUseAbility) {
                                selectedCharacter.receiveDamage(enemySelectedSpell.getDamage());
                            }

                            if(enemy.getCurrentMana() - enemySelectedSpell.getManaCost() >= 0) {

                                enemy.removeSpell(enemySelectedSpell);
                            }

                            enemy.setCurrentMana(enemy.getCurrentMana() - enemySelectedSpell.getManaCost());
                            if(enemy.getCurrentMana() <= 0) {
                                System.out.println("Enemy has now 0 mana");
                            } else {
                                System.out.println("Enemy has now " + enemy.getCurrentMana() + " mana");
                            }

                            System.out.println("Your life is at " + selectedCharacter.getCurrentLife());
                            System.out.println();

                            if(selectedCharacter.getCurrentLife() <= 0) {
                                System.out.println("You lost!");
                                System.exit(0);
                            }
                        }

                        if(enemyAttack == 1 || enemySpells.isEmpty() || (enemy.getCurrentMana() <= 0)) {
                            System.out.println("The enemy has chosen a normal attack");
                            int enemyDamage = enemy.getDamage();
                            selectedCharacter.receiveDamage(enemyDamage);

                            System.out.println("You are now at " + selectedCharacter.getCurrentLife() + " life");
                            System.out.println();

                            if(selectedCharacter.getCurrentLife() <= 0) {
                                System.out.println("You lost!");
                                System.exit(0);
                            }
                        }
                    }
                }

                if(grid.currentCell.cellType == CellEntityType.SANCTUARY && !grid.currentCell.getIsVisited()) {
                    clearScreen();
                    System.out.println("Level " + level);
                    System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                    grid.printGrid();
                    System.out.println();
                    System.out.println("You have encountered a sanctuary!");
                    grid.currentCell.setIsVisited();
                    System.out.println();

                    Random random = new Random();
                    int randomLifePoints = 25 + random.nextInt(51);
                    int randomManaPoints = 30 + random.nextInt(21);

                    selectedCharacter.regenerateLife(randomLifePoints);
                    selectedCharacter.regenerateMana(randomManaPoints);

                    System.out.println("You have gained " + randomLifePoints + " life");
                    System.out.println("You now have " + selectedCharacter.getCurrentLife() + " life");
                    System.out.println();

                    System.out.println("You have gained " + randomManaPoints + " mana");
                    System.out.println("You now have " + selectedCharacter.getCurrentMana() + " mana");
                    System.out.println();
                    //System.out.println("Level " + level);
                    //System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                    //grid.printGrid();
                }

                if(grid.currentCell.cellType == CellEntityType.PORTAL && !grid.currentCell.getIsVisited()) {
                    Random rand = new Random();
                    int randomLength = 5 + rand.nextInt(6);
                    int randomWidth = 5 + rand.nextInt(6);
                    this.grid = Grid.generateMap(randomLength, randomWidth);

                    clearScreen();
                    System.out.println("Level " + (level + 1));
                    System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                    grid.printGrid();
                    System.out.println();

                    //System.out.println("Level " + (level + 1));
                    System.out.println("You have encountered a portal!");
                    System.out.println("You get " + (level * 5) + " experience points");
                    selectedCharacter.setExperience(selectedCharacter.getExperience() + 5 * level);
                    System.out.println("You now have " + selectedCharacter.getExperience() + " experience points");

                    int extraLevel = selectedCharacter.getExperience()/25;
                    int extraCharisma = selectedCharacter.getExperience()/28;
                    int extraDexterity = selectedCharacter.getExperience()/35;
                    int extraStrength = selectedCharacter.getExperience()/38;

                    if(extraLevel >= 1) {
                        System.out.println("You used to be level " + selectedCharacter.getLevel());
                        selectedCharacter.setLevel(selectedCharacter.getLevel() + extraLevel);
                        System.out.println("You now are level " + selectedCharacter.getLevel());
                        System.out.println();
                    }

                    if(extraCharisma >= 1) {
                        System.out.println("You used to have " + selectedCharacter.getCharisma() + " charisma");
                        selectedCharacter.setCharisma(selectedCharacter.getCharisma() + extraCharisma);
                        System.out.println("You now have " + selectedCharacter.getCharisma() + " charisma");
                        System.out.println();
                    }

                    if(extraDexterity >= 1) {
                        System.out.println("You used to have " + selectedCharacter.getDexterity() + " dexterity");
                        selectedCharacter.setDexterity(selectedCharacter.getDexterity() + extraDexterity);
                        System.out.println("You now have " + selectedCharacter.getDexterity() + " dexterity");
                        System.out.println();
                    }

                    if(extraStrength >= 1) {
                        System.out.println("You used to have " + selectedCharacter.getStrength() + " strength");
                        selectedCharacter.setStrength(selectedCharacter.getStrength() + extraStrength);
                        System.out.println("You now have " + selectedCharacter.getStrength() + " strength");
                        System.out.println();
                    }

                    //Random rand = new Random();
                    //int randomLength = 5 + rand.nextInt(6);
                    //int randomWidth = 5 + rand.nextInt(6);
                    //this.grid = Grid.generateMap(randomLength, randomWidth);
                    //System.out.println("Level " + level);
                    //System.out.println("Enter movement commands (n, s, w, e). Type 'x' to quit.");
                    //grid.printGrid();
                    level++;
                }

                if(grid.currentCell.cellType == CellEntityType.VOID && !grid.currentCell.getIsVisited()) {
                    grid.currentCell.setIsVisited();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}

class Test{
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}