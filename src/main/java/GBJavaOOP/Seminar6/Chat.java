package GBJavaOOP.Seminar6;


public interface Chat {
    void sendMessage(String msg, User user);

    void appendClient(User user);

    void deleteClient(User user);
}
