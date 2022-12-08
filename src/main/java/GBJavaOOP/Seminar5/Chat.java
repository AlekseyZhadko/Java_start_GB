package GBJavaOOP.Seminar5;

interface Chat {
    void sendMessage(String msg, User user);

    void appendClient(User user);

    void deleteClient(User user);
}