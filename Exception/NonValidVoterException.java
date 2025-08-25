package Exception;

class NonValidVoterException extends Exception {
    private String message;
    NonValidVoterException(String message){
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
