import java.util.*;

public class School {

    private Map<Integer, List<String>> db;

    public School() {
        db = new HashMap<>();
    }

    public Map<Integer, List<String>> db() {
        return db;
    }

    public void add(String name, int grade) {
        List<String> students = db.getOrDefault(grade, new ArrayList<>());
        students.add(name);
        Collections.sort(students);
        db.put(grade, students);
    }

    public List<String> grade(int g) {
        return db.getOrDefault(g, new ArrayList<>());
    }

    public Map<Integer, List<String>> sort() {
        return db;
    }

}
