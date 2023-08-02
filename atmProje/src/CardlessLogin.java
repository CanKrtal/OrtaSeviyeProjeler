import java.util.Scanner;
public class CardlessLogin {
    public boolean cardlessLogin(Login login) {
        Scanner scanner = new Scanner(System.in);
        String tcNo;
        String parola;

        System.out.println("TC kimlik numaranızı giriniz: ");
        tcNo = scanner.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        parola = scanner.nextLine();

        if (login.getSysParola().equals(parola) && login.getTcKimlikNo().equals(tcNo)) {
            return true;
        } else {
            return false;
        }
    }
}