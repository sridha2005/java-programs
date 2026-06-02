import java.util.Scanner;

class vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}