public class SmartHouse {
    public static void main(String[] args) {
        SmartHouseMediator mediator = new SmartHouseMediator();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        MotionSensor motionSensor = new MotionSensor();

        motionSensor.sendMessage("Motion detected");
    }
}
