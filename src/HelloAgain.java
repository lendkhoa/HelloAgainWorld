import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloAgain {
  public static void main (String[] args) {
    InputStream inputStr = System.in;
    OutputStream outputStr = System.out;
    InputReader in = new InputReader(inputStr);
    OutputReader out = new OutputReader(outputStr);

    HelloAgain agent = new HelloAgain();
    agent.say_something();
    out.close();
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
