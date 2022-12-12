package GBJavaOOP.Seminar6;

class Message {
    User user;
    String userMessage;

    Enum flag;

    public Message(User user, String userMessage, FlagMessage flag) {
        this.flag = flag;
        this.user = user;
        this.userMessage = userMessage;
    }

    public User getUser() {
        return user;
    }

    public Enum getFlag() {
        return flag;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
