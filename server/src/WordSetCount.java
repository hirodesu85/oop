import java.util.*;

class WordSetCount {
    public static void main(String[] args) {
        Collection<String> c = new LinkedHashSet<String>();
        Scanner sc = FileScanner.fileScanner(args[0]);
        while (sc.hasNext()) {
            String w = sc.next();
            c.add(w);
        }
        System.out.println(c.size() + " words.");
    }
}