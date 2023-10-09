package com.example.patterns.command;

// Concrete command implement the Command interface
public class IncreaseVolumeCommand implements Command {
    VolumeControl volumeControl;

    public IncreaseVolumeCommand(VolumeControl volumeControl) {
        this.volumeControl = volumeControl;
    }

    @Override
    public void execute() {
        this.volumeControl.increaseVolume();
    }
}
