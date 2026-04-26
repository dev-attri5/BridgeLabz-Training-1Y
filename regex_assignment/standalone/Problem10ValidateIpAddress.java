import java.util.regex.Pattern;

public class Problem10ValidateIpAddress {
    public static void main(String[] args) {
        String octet = "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)";
        String regex = "^(" + octet + "\\.){3}" + octet + "$";
        String[] addresses = {"192.168.0.1", "255.255.255.255", "256.100.20.1", "10.10.10"};

        for (String address : addresses) {
            System.out.println(address + " -> " + (Pattern.matches(regex, address) ? "Valid" : "Invalid"));
        }
    }
}
