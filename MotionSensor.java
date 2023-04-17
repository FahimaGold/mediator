public class MotionSensor implements IDevice{

    @Override
    public void sendMessage(String name) {
         // Use a mediator to send a message from this component
    }

    @Override
    public void receiveMessage(String message) {
       System.out.println("Motion sensor received a" + message+ ", the owner will be notified that they expect a visitor");
    }
}
