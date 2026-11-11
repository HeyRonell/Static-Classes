package com.pluralsight;

// First and Last name only
public class NameFormatter {
    public static String format(String firstName, String lastName) {
        String format = lastName + ", " + firstName;
        return  format;
    }

    // Full name format
    public static String format(String prefix, String firstName, String middleName,
                                String lastName, String suffix) {

        StringBuilder fullName = new StringBuilder();

        fullName.append(lastName);
        fullName.append(", ");

        if (prefix != null && !prefix.isEmpty()) { // checking for prefix to append
            fullName.append(prefix);
            fullName.append(" ");
        }

        fullName.append(firstName);

        if (middleName != null && !middleName.isEmpty()) { // checking for middle to append
            fullName.append(" ");
            fullName.append(middleName);
        }

        if (suffix != null && !suffix.isEmpty()) { // checking for suffix to append
            fullName.append(" ");
            fullName.append(suffix);
        }

        return fullName.toString();
    }
}
