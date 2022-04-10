package pl.davko.jetbrains.excercise.basics.iostreams;

import java.io.InputStream;

public class InputStreams {

    public static void readByteStream() throws Exception {
        InputStream inputStream = System.in;
        byte singleByte = (byte) inputStream.read();

        while (singleByte != -1) {
            System.out.print(singleByte);
            singleByte = (byte) inputStream.read();
        }
        inputStream.close();
    }
}
