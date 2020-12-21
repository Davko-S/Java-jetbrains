package pl.davko.jetbrains.excercise.basics;

import java.util.List;

public class RemoteControl {
    private static final int LENGTH_IN_CM = 15;
    private static final int WIDTH_IN_CM = 4;
    private static final int THICKNESS_IN_CM = 1;

    private static final List<String> BUTTONS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "Power",
            "VolumeUp", "VolumeDown", "NextChannel", "PreviousChannel");

    private final String colour;

    private int currentVolume;
    private int currentChannel;

    public RemoteControl(String colour) {

        this.colour = colour;
    }


    public void volumeUp() {
        currentVolume++;
    }

    public void volumeDown() {
        currentVolume--;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int volume) {
        currentVolume = volume;
    }

    public void setCurrentChannel(int channel) {
        currentChannel = channel;
    }

    public String getColour() {
        return colour;
    }

}
