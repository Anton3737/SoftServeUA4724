package homework_java_introduction_04.task3;

public enum HTTPError {
    CONTINUE(100, "Continue"),
    SWITCHING_PROTOCOLS(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    NO_CONTENT(204, "No Content"),
    MOVED_PERMANENTLY(301, "Moved Permanently"),
    FOUND(302, "Found"),
    NOT_MODIFIED(304, "Not Modified"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable");

//    https://http.cat/[status_code]


    private final int HTTP_CODE;
    private final String MESSAGE_OF_RESPONSE;

    HTTPError(int HTTP_CODE, String MESSAGE_OF_RESPONSE) {
        this.HTTP_CODE = HTTP_CODE;
        this.MESSAGE_OF_RESPONSE = MESSAGE_OF_RESPONSE;
    }

    public static String getMessageAndCodOfResponse(int HTTP_CODE) {
        for (HTTPError codes : values()) {
            if (codes.HTTP_CODE == HTTP_CODE) {
                System.out.println("https://http.cat/" + HTTP_CODE);
                return codes.MESSAGE_OF_RESPONSE.toUpperCase();
            }
        }
        return "Невідомий код помилки або помилка відсутню в переліку константних";
    }
}
