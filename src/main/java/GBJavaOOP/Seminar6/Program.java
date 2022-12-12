package GBJavaOOP.Seminar6;


public class Program {
    public static void main(String[] args) {
        ChatRoom chat1 = new ChatRoom("******************  Флудилка  **********************");
        User client1 = UserBuilder
                .getInstance()
                .setNickname("Vasya22")
                .setName("Вася")
                .setStatus("Yahooo!")
                .build();
        System.out.println(client1);

        User client2 = UserBuilder
                .getInstance()
                .setNickname(null)
                .setName(null)
                .setStatus(null)
                .build();
        System.out.println(client2);

        User client3 = UserBuilder
                .getInstance()
                .setNickname("Masha ^_^")
                .setName("Маша")
                .setStatus("LoL")
                .build();
        System.out.println(client3);

        chat1.appendClient(client1);
        chat1.appendClient(client2);
        chat1.appendClient(client3);

        client1.sendMsg("привет всем!", chat1);
        client2.sendMsg("ку-ку!", chat1);
        client3.sendMsg("привет!", chat1);

        User client4 = UserBuilder
                .getInstance()
                .setNickname("Den #_#")
                .setName("Денис")
                .setStatus("LoL")
                .build();
        System.out.println(client4);

        chat1.appendClient(client4);

        client3.sendMsg("hi, как дела?",chat1);
        client1.sendMsg("норм!",chat1);
        client2.sendMsg("good!",chat1);

        chat1.deleteClient(client4);

        //chat1.ReadChat();
        client1.readUserChat(chat1);
    }
}
