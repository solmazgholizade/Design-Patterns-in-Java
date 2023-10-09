package com.example.patterns.command;

// Concrete command implement the Command interface
public class TurnOnCommand implements Command {
    Switchable switchable;

    public TurnOnCommand(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        this.switchable.turnOn();
    }
}
