package Exercise3_ISP;

public class Smartphone implements CallAndSMS, WebBrowsing, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " via smartphone...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS from smartphone to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture...");
    }
}
