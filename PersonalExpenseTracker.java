import java.io.*;
import java.util.*;

class Expense {
    String date;
    String category;
    double amount;

    public Expense(String date, String category, double amount) { //Parameterized constructor
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " | " + category + " | " + amount;
    }
}

public class PersonalExpenseTracker {
    private static final String FILE_NAME = "expenses.csv";
    private static ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        loadExpenses();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Personal Expense Tracker ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total by Category");
            System.out.println("4. View Total by Date");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addExpense(sc);
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    viewTotalByCategory(sc);
                    break;
                case 4:
                    viewTotalByDate(sc);
                    break;
                case 5:
                    saveExpenses();
                    System.out.println("Exiting... Data saved to " + FILE_NAME);
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addExpense(Scanner sc) {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        System.out.print("Enter category (Food, Travel, Shopping, etc.): ");
        String category = sc.nextLine();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        Expense exp = new Expense(date, category, amount);
        expenses.add(exp);
        System.out.println("Expense added successfully!");
    }

    private static void viewAllExpenses() {
        System.out.println("\n==== All Expenses ====");
        for (Expense e : expenses) { 
            System.out.println(e);
        }
    }

    private static void viewTotalByCategory(Scanner sc) {
        System.out.print("Enter category to filter: ");
        String category = sc.nextLine();
        double total = 0;
        for (Expense e : expenses) {
            if (e.category.equalsIgnoreCase(category)) {
                total += e.amount;
            }
        }
        System.out.println("Total spent in " + category + ": " + total);
    }

    private static void viewTotalByDate(Scanner sc) {
        System.out.print("Enter date (YYYY-MM-DD) to filter: ");
        String date = sc.nextLine();
        double total = 0;
        for (Expense e : expenses) {
            if (e.date.equals(date)) {
                total += e.amount;
            }
        }
        System.out.println("Total spent on " + date + ": " + total);
    }

    private static void saveExpenses() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Expense e : expenses) {
                pw.println(e.date + "," + e.category + "," + e.amount);
            }
        } catch (IOException e) {
            System.out.println("Error saving expenses: " + e.getMessage());
        }
    }

    private static void loadExpenses() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String date = parts[0];
                    String category = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    expenses.add(new Expense(date, category, amount));
                }
            }
        } catch (FileNotFoundException e) {
            // First time run, no file yet
        } catch (IOException e) {
            System.out.println("Error loading expenses: " + e.getMessage());
        }
    }
}
