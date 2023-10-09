package com.example.patterns.command;

// Concrete command implement the Command interface
public class DecreaseVolumeCommand implements Command {
    VolumeControl volumeControl;

    public DecreaseVolumeCommand(VolumeControl volumeControl) {
        this.volumeControl = volumeControl;
    }

    @Override
    public void execute() {
        this.volumeControl.decreaseVolume();
    }
}
