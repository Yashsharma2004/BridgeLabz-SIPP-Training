public class Login extends LoginBase {
    public Login(String email, String password) {
        super(email, password);
    }

    @Override
    public boolean authenticate() {
        
        return true;
    }
}