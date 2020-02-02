package lesson12;

public interface BankSystem {
    //if all methods without implementation - use interface
    //if at least one method is implemented - user abstract class
    void withdraw(User user, int amount);

    void fund(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
