interface Student1 {
    int marks = 26;
    void calculate();
}

interface Student2 {
    int marks = 24;
    void calculate();
}

class AverageMarks implements Student1, Student2 {
    public void calculate() {
        int marks = (Student1.marks + Student2.marks) / 2;
        System.out.println(marks);
    }
}

class MultipleInterface {
    public static void main(String args[]) {
        AverageMarks a = new AverageMarks();
        a.calculate();
    }
}
