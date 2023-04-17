import java.util.ArrayList;
import java.util.List;

public class SmartHouseMediator {
    List<IDevice> devices;

    public SmartHouseMediator() {
        this.devices = new ArrayList<>();
    }
    public void addDevice(IDevice device){
        devices.add(device);
    }

    // complete this code of mediator
}
