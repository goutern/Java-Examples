package com.goutermoutlabs;

public class Email extends Document {
    private String sender;
    private String receiver;
    private String title;

    //Constuctors
    public Email() {
    }

    ;

    public Email(String text, String s, String r, String t) {
        this.setText(text);
        this.sender = s;
        this.receiver = r;
        this.title = t;
    }

    public Email(Email e) {
        this.setText(e.getText());
        this.sender = e.sender;
        this.receiver = e.receiver;
        this.title = e.title;
    }


    public String getText() {
        return super.toString();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "com.goutermoutlabs.Email{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", text='" + getText() + '\'' +
                '}';
    }
}
