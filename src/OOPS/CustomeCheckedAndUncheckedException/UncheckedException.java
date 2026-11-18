package OOPS.CustomeCheckedAndUncheckedException;

// Custom unchecked exception
class InvalidPinException extends RuntimeException {

    InvalidPinException(String message) {
        super(message);
    }
}

public class UncheckedException {

    static void validatePin(String pin) {

        if (pin == null || !pin.matches("\\d{4}")) {
            throw new InvalidPinException(
                    "PIN must contain exactly 4 digits"
            );
        }

        System.out.println("PIN validated successfully");
    }

    public static void main(String[] args) {

        try {
            validatePin("123");
        }
        catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
