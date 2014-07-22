package SystemInOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn {

    public static void main(String[] args) throws IOException {

        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            c = (String) br.readLine();
            System.out.println(c);
        } while (!c.equals("stop"));

        SystemIn systemIn = new SystemIn();
        systemIn.masOfStrings();

    }

    void masOfStrings() throws IOException {

        String[] mas = new String[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 100; i++) {
            mas[i] = br.readLine();
            if (mas[i].equals("stop")) break;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(mas[i]);
            if (mas[i].equals("stop")) break;
        }

    }

}
