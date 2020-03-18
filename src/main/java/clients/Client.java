package clients;

public class Client {
    private String clientName;
    private String clientPhoneNumber;

    public void Client(String clientName, String clientPhoneNumber) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }



}
