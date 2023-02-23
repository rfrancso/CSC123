//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

public class InvString {
    private String str;

    public InvString(String s) {
        this.str = s;
    }

    public String toString() {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
