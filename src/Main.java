// You don't need to add/edit anything to the below solution. 
// Click on the SUBMIT button to solve your first problem on CodeChef.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// Remember that the class name should be "Main" and should be "public".
public class Main {
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;
        System.out.print("Enter Number: ");
        InputReader in = new InputReader(inputStream);

        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            // Read the numbers a and b.
            System.out.print("Enter Number a: ");
            int a = in.nextInt();
            System.out.print("Enter Number b: ");
            int b = in.nextInt();

            // Compute the sum of a and b.
            int ans = a + b;
            System.out.println(ans);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}