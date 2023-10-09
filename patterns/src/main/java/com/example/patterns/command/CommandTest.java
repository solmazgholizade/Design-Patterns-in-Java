package com.example.patterns.command;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();
        Radio radio = new Radio();
        RemoteControl remoteControl;
        remoteControl = new RemoteControl(new TurnOnCommand(light));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new TurnOnCommand(tv));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new TurnOnCommand(radio));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new IncreaseVolumeCommand(tv));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new IncreaseVolumeCommand(radio));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new DecreaseVolumeCommand(radio));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new TurnOffCommand(radio));
        remoteControl.pressButton();
        remoteControl = new RemoteControl(new TurnOffCommand(light));
        remoteControl.pressButton();

//        test with setCommand()
//        System.out.println("TEST WITH SETCOMMAND()");
//        TurnOnCommand turnOnLight = new TurnOnCommand(light);
//        TurnOnCommand turnOnTv = new TurnOnCommand(tv);
//        IncreaseVolumeCommand increaseVolumeTv = new IncreaseVolumeCommand(tv);
//        DecreaseVolumeCommand decreaseVolumeTv = new DecreaseVolumeCommand(tv);
//        RemoteControl remoteControl1 = new RemoteControl();
//        remoteControl1.setCommand(turnOnLight);
//        remoteControl1.pressButton();
//        remoteControl1.setCommand(turnOnTv);
//        remoteControl1.pressButton();
//        remoteControl1.setCommand(increaseVolumeTv);
//        remoteControl1.pressButton();
//        remoteControl1.setCommand(decreaseVolumeTv);
//        remoteControl1.pressButton();

        // test with Anonymous inner class
        System.out.println("TEST WITH ANONYMOUS INNER CLASS:");
        RemoteControl remoteControl2;
        remoteControl2 = new RemoteControl(new Command() {
            @Override
            public void execute() {
                light.turnOn();
            }
        });
        remoteControl2.pressButton();

        // test with Lambda
        System.out.println("TEST WITH LAMBDA:");
        remoteControl2 = new RemoteControl(() -> tv.turnOn());
        remoteControl2.pressButton();
        remoteControl2 = new RemoteControl(() -> tv.increaseVolume());
        remoteControl2.pressButton();
        remoteControl2 = new RemoteControl(() -> tv.decreaseVolume());
        remoteControl2.pressButton();

        // test with Lambda
        System.out.println("TEST with METHOD REFERENCE:");
        remoteControl2 = new RemoteControl(radio::turnOn);
        remoteControl2.pressButton();
        remoteControl2 = new RemoteControl(radio::increaseVolume);
        remoteControl2.pressButton();
        remoteControl2 = new RemoteControl(tv::turnOff);
        remoteControl2.pressButton();
        remoteControl2 = new RemoteControl(light::turnOff);
        remoteControl2.pressButton();
    }
}

