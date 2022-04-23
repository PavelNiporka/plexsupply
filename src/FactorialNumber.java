import com.google.common.math.BigIntegerMath;

import java.io.*;
import java.math.BigInteger;


public class FactorialNumber{

    public static void main(String[] args) throws IOException {

        File input = new File("");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        File output = new File("");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
        String st;
        int num = 0;
        while ((st = bufferedReader.readLine()) != null) {
            try {
                num = Integer.parseInt(st);
                bufferedWriter.write(st + " = " + factorial(num));
                bufferedWriter.newLine();
            } catch (NumberFormatException | IOException nfe) {
                // Handle the condition when str is not a number.
            }
        }
        bufferedReader.close();

    }
    public static BigInteger factorial(int n) {
        return BigIntegerMath.factorial(n);
    }

}
