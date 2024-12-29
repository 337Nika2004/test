public class test {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] expenses = {12000, 23000, 17000, 25000, 19000};
        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");


        // Задача 2
        System.out.println("\nЗадача 2");
        int[] weeklyExpenses = {12000, 23000, 17000, 25000, 19000};
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];
        for (int expense : weeklyExpenses) {
            if (expense < minExpense) minExpense = expense;
            if (expense > maxExpense) maxExpense = expense;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        // Задача 3
        System.out.println("\nЗадача 3");
        int sum = 0;
        for (int expense : weeklyExpenses) {
            sum += expense;
        }
        double averageExpense = (double) sum / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");


        // Задача 4
        System.out.println("\nЗадача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = temp;
        }
        System.out.print("Результат разворота массива: ");
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        System.out.println();
    }
}