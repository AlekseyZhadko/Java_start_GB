package GBJavaOOP.Seminar5;

class User {
    public String name;
    private Chat chatroom;

    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
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

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }
}