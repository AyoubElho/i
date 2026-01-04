import java.sql.Array;

void main(String[] args) {

//  Exercice 1
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Entre number of students : ");
    int students = myScanner.nextInt();

    double[] grades = new double[students];


    for (int i = 0; i < students; i++) {
        System.out.println("Entre grade of student : " + (i + 1));
        double gr = myScanner.nextDouble();
        grades[i] = gr;
    }
    Arrays.sort(grades);
    double avg = Arrays.stream(grades).sum() / grades.length;
    System.out.println(avg);
    double max = grades[grades.length - 1];
    System.out.println(max);
    double min = grades[0];
    System.out.println(min);


    System.out.println("Entre student : ");
    double grade = myScanner.nextDouble();
    int i = 0;
    for (Double g : grades) {
        if (g == grade) {
            i++;
        }
    }
    System.out.println("number of students has " + grade + " is" + i);

    myScanner.close();


    // Exercice 2
    System.out.println("Entrez un verbe du premier groupe : ");
    String verb = myScanner.nextLine();

    if (verb.endsWith("er")) {
        String str = verb.substring(0, verb.length() - 2);
        System.out.println(str);
        String[] endings = {"e", "es", "e", "ons", "ez", "ent"};
        String[] subjects = {"je", "tu", "il/elle", "nous", "vous", "ils/elles"};
        for (int j = 0; j < endings.length; j++) {
            System.out.println(subjects[j] + " " + str + endings[j]);
        }
    } else {
        System.out.println("Ce verbe n'est pas du premier groupe !");
    }


    // Exercice 3

    String character = "";   // stored string
    int choice;

    do {
        System.out.println("\n====== MENU ======");
        System.out.println("1. Enter a string");
        System.out.println("2. Display the string");
        System.out.println("3. Reverse the string");
        System.out.println("4. Number of words");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");

        choice = myScanner.nextInt();
        myScanner.nextLine(); // clear buffer

        if (choice == 1) {

            System.out.println("Enter a string: ");
            character = myScanner.nextLine();

            System.out.println("Press any key to return to the menu...");
            myScanner.nextLine();

        } else if (choice == 2) {

            System.out.println("String: " + character);

            System.out.println("Press any key to return to the menu...");
            myScanner.nextLine();

        } else if (choice == 3) {

            // Reverse (your logic)
            String[] lists = character.split("");
            String vars = "";

            for (int k = lists.length - 1; k >= 0; k--) {
                vars += lists[k];
            }

            System.out.println("Reversed: " + vars);

            System.out.println("Press any key to return to the menu...");
            myScanner.nextLine();

        } else if (choice == 4) {

            // Count words (correct way)
            if (character.trim().isEmpty()) {
                System.out.println("Number of words: 0");
            } else {
                System.out.println("Number of words: "
                        + character.trim().split("\\s+").length);
            }

            System.out.println("Press any key to return to the menu...");
            myScanner.nextLine();

        } else if (choice == 0) {

            System.out.println("Goodbye!");

        } else {

            System.out.println("Invalid choice!");
            System.out.println("Press any key to return to the menu...");
            myScanner.nextLine();
        }

    } while (choice != 0);

    myScanner.close();


    // Exercice 4
    String text = "Jeanne".toLowerCase();
    HashMap<Character, Integer> list = new HashMap<>();

    for (char c : text.toCharArray()) {
        System.out.println(Character.isLetter(c));
        if (Character.isLetter(c)) {
            list.put(c, list.getOrDefault(c, 0) + 1);
        }
    }

    System.out.println(list);
}
