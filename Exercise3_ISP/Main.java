package Exercise3_ISP;

public class Main {
    public static void main(String[] args) {
        CallAndSMS basicPhone = new BasicPhone();
        basicPhone.makeCall("+63 912 345 6789");
        basicPhone.sendSMS("+63 912 345 6789", "Hello!" + "\n");

        Smartphone smartphone = new Smartphone();
        smartphone.makeCall("+63 912 345 6789");
        smartphone.sendSMS("+63 912 345 6789","Hi there!");
        smartphone.browseWeb("https://example.com");
        smartphone.takePicture();
    }
}
