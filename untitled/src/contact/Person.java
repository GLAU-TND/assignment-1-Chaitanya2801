package contact;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private String[] contactNo;
    private String email;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstName).append('\n');
        sb.append("Last Name: ").append(lastName).append('\n');
        sb.append("Contact No: ");
        for (int i = 0; i < contactNo.length; i++) {
            sb.append((contactNo[0] != null && i == 0 ? contactNo[0] : "") + (contactNo[1] != null && i == 1 ? ", " + contactNo[1] : "") +
                    (contactNo[2] != null && i == 2 ? ", " + contactNo[i] : ""));
        }
        sb.append("\nEmail: ").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------\n");
        return sb.toString();
    }
}
