package mediator;

public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name+ " получил сообщение : " + message);
    }
}
