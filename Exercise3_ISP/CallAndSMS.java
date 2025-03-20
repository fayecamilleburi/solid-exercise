package Exercise3_ISP;

public interface CallAndSMS {
    public void makeCall(String number);
    public void sendSMS(String number, String message);
}
