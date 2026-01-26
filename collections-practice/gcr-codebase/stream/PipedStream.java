package Stream;
import java.io.*;
public class PipedStream {
	public static void main(String[] args) {
        try {
            
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            
            Thread writer = new Thread(new WriterThread(pos));
            Thread reader = new Thread(new ReaderThread(pis));

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class WriterThread implements Runnable {
    private final PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        String[] messages = {
            "Hello",
            "This is piped stream demo",
            "Inter-thread communication works!",
            "END"
        };

        try {
            for (String msg : messages) {
                pos.write(msg.getBytes());
                pos.write('\n'); // delimiter
                pos.flush();
                Thread.sleep(500); // simulate work
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Writer Error: " + e.getMessage());
        } finally {
            try {
                pos.close();
            } catch (IOException ignored) {}
        }
    }
}


class ReaderThread implements Runnable {
    private final PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reader received: " + line);
                if (line.equals("END")) break;
            }
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}
