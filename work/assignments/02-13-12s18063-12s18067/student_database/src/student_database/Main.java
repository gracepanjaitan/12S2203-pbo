package student_database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 13-12s18063 Calvin Adelbert Lumban Gaol
 * @author 13-12s18067 Grace Vidia Rosa Panjaitan
 */
public class Main {

    private static List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();

    public static void main(String[] _args) {
        Scanner in = new Scanner(System.in);
        String s;
        boolean quit = false;

        do {
            s = in.nextLine();
            String[] tokens = s.split(" ");
            String output = "";

            switch (tokens[0]) {
                case "add":
                    add(tokens[1], tokens[2]);
                    break;
                case "find":
                    output = find(tokens[1]);
                    break;
                case "count":
                    output = "" + count();
                    break;
                case "reset":
                    reset();
                    break;
                case "exit":
                    quit = true;
            }
            if (output.length() > 0) {
                System.out.println(output);
            }
        } while (!quit);
    }

    public static void add(String _nim, String _name) {
        int check = 0;
        for (int i = 0; i < nims.size(); i++) {
            if (_nim.equals(nims.get(i))) {
                check++;
            }
        }
        if (check == 0) {
            nims.add(_nim);
            names.add(_name);
        }
    }

    public static String find(String _nim) {
        String result = "";
        for (int i = 0; i < nims.size(); i++) {
            if (_nim.equals(nims.get(i))) {
                result = nims.get(i) + names.get(i);
            }
        }
        return "";
    }

    public static int count() {
        return nims.size();
    }

    public static void reset() {
        nims.clear();
        names.clear();
    }
}
