package entity;

public enum ErrorMessages {
    FILE_NOT_FOUND("File not found!"),
    UNABLE_TO_READ_FILE("Unable to read file!"),
    WRONG_CLIENT("Unable to parse login page for this client!"),
    UNABLE_TO_OPEN_LINK("Unable to open link!"),
    UNABLE_TO_GET_RESPONSE("Unable to get response!"),
    UNABLE_TO_GET_SUBMIT_BUTTON("Unable to get submit button!"),
    UNABLE_TO_GET_TEXT_INPUT_FIELD("Unable to get text input field!");

    private final String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
