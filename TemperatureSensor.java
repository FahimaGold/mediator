public class TemperatureSensor implements IDevice{
    @Override
    public void sendMessage(String message) {
        // Use a mediator to send a message from this component
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Temperature sensor received a" + message + ", the room temperature will be adjusted");
    }
}
