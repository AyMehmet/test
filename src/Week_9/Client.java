package Week_9;

import java.util.Date;

public class Client {
    int client_Id;
    String firstName;
    String lastName;
    Date birthday;
    Date creationTimeofAccount;
    char gender;
    int balance;
    int password;

    public Client(int client_Id, String firstName, String lastName, char gender, int balance, int password) {
        this.client_Id = client_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.balance = balance;
        this.password = password;
    }


    public Client(int client_Id, String firstName, String lastName, Date birthday, Date creationTimeofAccount, char gender, int balance, int password) {
        this.client_Id = client_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.creationTimeofAccount = creationTimeofAccount;
        this.gender = gender;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_Id=" + client_Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                ", password=" + password +
                '}';
    }
}
