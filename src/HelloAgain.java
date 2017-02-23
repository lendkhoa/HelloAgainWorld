import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelloAgain {
  public static void main (String[] args) {
    InputStream inputStr = System.in;
    OutputStream outputStr = System.out;
    InputReader in = new InputReader(inputStr);
    PrintWriter out = new PrintWriter(outputStr);

    HelloAgain agent = new HelloAgain();
    agent.say_something(in, out);
    agent.say_in_french("Bonjour, monseur. Comment ca-va?", in, out);
    
    out.close();
  }
  
  public static void say_something(InputReader in, PrintWriter out) {
    out.println("Hello again, world!");
  }

  public static void say_in_french(String message, InputReader in, PrintWriter out) {
    out.println(message);
  }

  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;
    private static final int BUFFER_SIZE = 32768;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(
                  new InputStreamReader(stream), BUFFER_SIZE);
      tokenizer = null;
    }

  }
}
