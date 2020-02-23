package contact;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private String[] contactNo;
    private String email;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactNo=").append(contactNo == null ? "null" : Arrays.asList(contactNo).toString());
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
