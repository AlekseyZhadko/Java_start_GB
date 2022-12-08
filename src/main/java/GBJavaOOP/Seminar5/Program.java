package GBJavaOOP.Seminar5;

public class Program {
    public static void main(String[] args) {
        ChatRoom chat1 = new ChatRoom("******************  Флудилка  **********************");
        User client1 = new User("Вася", chat1);
        User client2 = new User("Маша", chat1);
        User client3 = new User("Петя", chat1);
        chat1.appendClient(client1);
        chat1.appendClient(client2);
        chat1.appendClient(client3);

        client1.sendMsg("привет всем!");
        client2.sendMsg("ку-ку!");
        client3.sendMsg("привет!");

        User client4 = new User("Коля", chat1);
        chat1.appendClient(client4);

        client3.sendMsg("hi, как дела?");
        client1.sendMsg("норм!");
        client2.sendMsg("good!");

        chat1.deleteClient(client4);

        chat1.ReadChat();
        System.out.println("\n\n\n");
        client1.readUserChat(chat1);
    }
}








