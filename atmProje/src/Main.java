public class Main {
    public static void main(String[] args) {
        Login login = new Login("11111111111", "1234", 10000);
        Account account = new Account();

        account.operation(login);
    }
}