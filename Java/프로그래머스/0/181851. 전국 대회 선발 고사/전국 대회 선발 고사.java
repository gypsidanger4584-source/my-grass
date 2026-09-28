import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    int rank;
    
    public Student(int id,int rank){
        this.id = id;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student other){
        return Integer.compare(this.rank, other.rank);
    }
}
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                list.add(new Student(i,rank[i]));
            }
        }
        Collections.sort(list);
        int a = list.get(0).id;
        int b = list.get(1).id;
        int c = list.get(2).id;
        return 10000*a+100*b+c;
    }
}