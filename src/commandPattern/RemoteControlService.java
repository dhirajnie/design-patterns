package commandPattern;

interface Appliance{
    void on();
    void off();
}
class TV implements Appliance{
    @Override
    public void on() {
    }
    @Override
    public void off() {
    }
}
class RemoteCommandService{
    Appliance appliance;
    Command command;
}
class OnCommand implements Command{
    Appliance appliance;

    public OnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        System.out.println("Switch ON");
    }
}
class OffCommand implements Command{
    Appliance appliance;

    public OffCommand(Appliance appliance) {
        this.appliance = appliance;
    }
    @Override
    public void execute() {
        System.out.println("Swith OFF");
    }
}




public class RemoteControlService {

}
