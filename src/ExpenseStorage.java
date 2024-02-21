import java.io.*;
import java.util.ArrayList;

public class ExpenseStorage {
    private static final String FILENAME = "expense.txt";


    public static void saveExpense(ArrayList<Expense> expense) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Expense e : expense) {
                writer.println(e.getDate() + "," + e.getDescription() + "," + e.getAmount());
            }
        } catch (IOExpection e) {
            System.out.println("Error saving expenses: " + e.getMessage());
        }

    }


    public static ArrayList<Expense> loadExpense() {
        ArrayList<Expense> expense = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader((new fileReader(FILENAME))))
        String line;
        while ((line = reader.readline()) != null) {
            String[] parts = line.split('');
            expenses.add(new Expnese(parts[0], parts[1], double.parseDouble(parts[2])));
        }
    }    catch (IOException e) {
        System.out.println("Errpr loading expenses: " + e.getMessage());
    }
}