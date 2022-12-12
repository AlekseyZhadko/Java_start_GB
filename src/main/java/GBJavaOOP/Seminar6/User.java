package GBJavaOOP.Seminar6;


public class User {
    protected static int id = 0;
    String nickname;
    String name;
    String status;

    public Chat chatroom;

    static {
        User.id = 0;
    }

    void printMessage(Message mess, String me) {
        if (mess.getFlag().equals(FlagMessage.USER)) {
            if (me.equals(mess.getUser().name)) {
                System.out.printf("                             %-15s: %-15s\n", mess.getUserMessage(), name);
            } else {
                System.out.printf("%s: %s\n", name, mess.getUserMessage());
            }
        } else {
            System.out.printf("     %s\n", mess.getUserMessage());
        }
    }

    void readUserChat(ChatRoom chat) {
        String me = this.name;
        System.out.println(chat.getNameChat());
        for (Message mess : chat.message) {
            mess.getUser().printMessage(mess, me);
        }
    }

    void sendMsg(String text, ChatRoom chat) {
        this.chatroom = chat;
        chatroom.sendMessage(text, this);
    }

    @Override
    public String toString() {
        return String.format("id: %d\n" +
                        "Nickname: %s\n" +
                        "Name: %s\n" +
                        "Status: %s\n",
                ++User.id, nickname, name, status);
    }
}
