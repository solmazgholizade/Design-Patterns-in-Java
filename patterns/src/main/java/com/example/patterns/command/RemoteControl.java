package com.example.patterns.command;

// The Invoker class
public class RemoteControl {
    Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

//    public void setCommand(Command command) {
//        this.command = command;
//    }

    public void pressButton() {
        command.execute();
    }
}
