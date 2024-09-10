import java.util.Comparator;
import java.util.PriorityQueue;

public class java_obj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<Student>();

        pq.add(new Student("Rakibul", 32));
        pq.add(new Student("Hasan", 2));
        pq.add(new Student("Tanvir", 3));
        pq.add(new Student("Zaidur", 43));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name +" "+ pq.peek().rank);
            pq.remove();
        }
    }
}
