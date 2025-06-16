package uk.ac.newcastle.enterprisemiddleware.hotel;

import javax.validation.ValidationException;

/**
 * <p>ValidationException caused if Hotel data is incomplete or invalid.</p>
 */
public class InvalidHotelDataException extends ValidationException {

    public InvalidHotelDataException(String message) {
        super(message);
    }

    public InvalidHotelDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidHotelDataException(Throwable cause) {
        super(cause);
    }
}
