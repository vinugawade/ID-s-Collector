package Student_Id;

import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.regex.Matcher;
import java.io.FileInputStream;
import java.util.regex.Pattern;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Vinu Gawade
 */
public class Validator {

    static Pattern p;
    static Matcher m;

    protected static boolean isValidPhoneNo(String num) {
        p = Pattern.compile("^[6-9]\\d{9}$"); // Mobile Number Regex.
        m = p.matcher(num);
        return (m.matches());
    }

    protected static boolean isValidEnrollNo(String num) {
        p = Pattern.compile("^[0-9]\\d{9}$"); // Enrollment Number Regex.
        m = p.matcher(num);
        return (m.matches());
    }

    public static boolean isValidText(String name) {
        p = Pattern.compile("^[A-Z a-z]*$"); // Text Regex.
        m = p.matcher(name);
        return (m.matches());
    }

    protected static byte[] Convert_To_BLOB(String file) {
        ByteArrayOutputStream bos = null;
        try {
            System.out.println("Input File Image:" + file);
            File f = new File(file);
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[500000];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex + "View_Form@412\n" + Arrays.toString(ex.getStackTrace()));
        } catch (IOException ex) {
            System.out.println(ex + "View_Form@414\n" + Arrays.toString(ex.getStackTrace()));
        }
        return bos != null ? bos.toByteArray() : null;
    }
}
