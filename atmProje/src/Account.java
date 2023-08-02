import java.util.Scanner;
public class Account {
    public Account(){
        System.out.println("HOŞGELDİNİZ");
    }
    public void operation(Login login) {
        Scanner scanner = new Scanner(System.in);
        CardLogin cardLogin = new CardLogin();
        CardlessLogin cardlessLogin = new CardlessLogin();
        while (true) {
            System.out.println("1.Kartlı İşlem\n" + "2.Kartsız İşlem");
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            int selectLogin = scanner.nextInt();
            if (selectLogin == 1) {
                if (cardLogin.cardLogin(login)) {
                    while (true) {
                        System.out.println("1.Bakiye Sorgulama\n" + "2.Para Yatır\n" + "3.Para Çek\n" + "4.Çıkış Yap");
                        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                        int selection = scanner.nextInt();

                        if (selection == 1) {
                            System.out.println("Mevcut bakiye: " + login.getBakiye());
                        } else if (selection == 2) {
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int total = scanner.nextInt();
                            scanner.nextLine();
                            login.paraYatir(total);
                        } else if (selection == 3) {
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            int total = scanner.nextInt();
                            scanner.nextLine();
                            login.paraCek(total);
                        } else if (selection == 4) {
                            System.out.println("Çıkış yaptınız");
                            break;
                        } else {
                            System.out.println("Hatalı işlem seçtiniz");
                        }
                    }
                }
            } else if (selectLogin == 2) {
                if (cardlessLogin.cardlessLogin(login)) {
                    while (true) {
                        System.out.println("1.Bakiye Sorgulama\n" + "2.Para Yatır\n" + "3.Para Çek\n" + "4.Çıkış Yap");
                        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                        int selection = scanner.nextInt();

                        if (selection == 1) {
                            System.out.println("Mevcut bakiye: " + login.getBakiye());
                        } else if (selection == 2) {
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int total = scanner.nextInt();
                            scanner.nextLine();
                            login.paraYatir(total);
                        } else if (selection == 3) {
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            int total = scanner.nextInt();
                            scanner.nextLine();
                            login.paraCek(total);
                        } else if (selection == 4) {
                            System.out.println("Çıkış yaptınız");
                            break;
                        } else {
                            System.out.println("Yanlış işlem seçtiniz");
                        }
                    }
                }
            }
        }
    }
}