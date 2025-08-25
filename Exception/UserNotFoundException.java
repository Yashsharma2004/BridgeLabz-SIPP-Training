package Exception;

class UserNotFoundException extends Exception {
    private String message;
    UserNotFoundException(String message){
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}