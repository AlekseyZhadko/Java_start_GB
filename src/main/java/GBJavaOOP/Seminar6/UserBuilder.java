package GBJavaOOP.Seminar6;

public class UserBuilder {
    private static UserBuilder instance;
    User obj;

    public static UserBuilder getInstance() {
        if (instance == null)
            instance = new UserBuilder();
        instance.obj = new User();
        return instance;
    }

    private UserBuilder() {
    }

    public UserBuilder setNickname(String nickname) {
        obj.nickname = new ProxyNickname(nickname).getNickname();
        return this;
    }

    public UserBuilder setName(String name) {
        obj.name = new ProxyName(name).getName();
        return this;
    }

    public UserBuilder setStatus(String status) {
        obj.status = status;
        return this;
    }
    public User build() {
        return obj;
    }

}

class ProxyNickname extends User {
    String nickname;
    public String NullNickname() {
        return super.nickname="User_"+(super.id+1);
    }
    public String getNickname() {
        return nickname;
    }

    public ProxyNickname(String argsNickname) {
        if (argsNickname != null) {
            nickname = argsNickname;
        } else
            nickname = this.NullNickname();
    }
}


class ProxyName extends User {
    String name;
    public String NullName() {
        return super.nickname="User_"+(super.id+1);
    }
    public String getName() {
        return name;
    }

    public ProxyName(String argsName) {
        if (argsName != null) {
            name = argsName;
        } else
            name = this.NullName();
    }
}


