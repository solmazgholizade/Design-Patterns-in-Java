package com.example.patterns.command;

// Concrete command implement the Command interface
public class TurnOffCommand implements Command {

    Switchable switchable;

    public TurnOffCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        this.switchable.turnOff();
    }
}
