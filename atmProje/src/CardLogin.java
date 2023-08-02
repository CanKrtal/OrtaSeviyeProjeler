import java.util.Scanner;
public class CardLogin {
    public boolean cardLogin(Login login) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifrenizi giriniz: ");
        String parola = scanner.nextLine();

        if (login.getSysParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}
