public class UtilityClassLibraryDemo {

    static class FormatHelper {
        public static void printLine() {
            System.out.println("------------------------------");
        }

        public static void printTitle(String title) {
            System.out.println(title);
            printLine();
        }

        public static void printCurrency(String label, double amount) {
            System.out.printf("%-15s: $ %.2f%n", label, amount);
        }
    }

    static class MathHelper {
        public static double calculateAverage(int total, int count) {
            if (count == 0) {
                return 0;
            }

            return total / (double) count;
        }

        public static double calculatePercentage(double value, double total) {
            if (total == 0) {
                return 0;
            }

            return (value / total) * 100;
        }
    }

    static class ValidationHelper {
        public static boolean isValidMark(double mark) {
            return mark >= 0 && mark <= 100;
        }

        public static boolean isNotEmpty(String text) {
            return text != null && !text.trim().isEmpty();
        }

        public static boolean isPositive(double value) {
            return value > 0;
        }
    }

    public static void main(String[] args) {
        FormatHelper.printTitle("Utility Class Library Demo");

        int totalMarks = 250;
        int numberOfSubjects = 3;
        double average = MathHelper.calculateAverage(totalMarks, numberOfSubjects);

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Subjects    : " + numberOfSubjects);
        System.out.printf("Average     : %.2f%n", average);

        FormatHelper.printLine();

        double price = 100.00;
        double tax = price * 0.06;
        double total = price + tax;

        FormatHelper.printCurrency("Price", price);
        FormatHelper.printCurrency("Tax", tax);
        FormatHelper.printCurrency("Total", total);

        FormatHelper.printLine();

        System.out.println("Valid mark : " + ValidationHelper.isValidMark(average));
        System.out.println("Valid name : " + ValidationHelper.isNotEmpty("Alex Tan"));
        System.out.println("Valid price: " + ValidationHelper.isPositive(price));
    }
}
