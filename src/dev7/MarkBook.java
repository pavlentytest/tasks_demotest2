package dev7;

class MarkBook {
    int [] marks;
    double averageGrade; // 0.0


    public MarkBook(int[] marks) {
        this.marks = marks;
        for(int i: this.marks) {
            averageGrade += i;
        }
        averageGrade = (marks.length > 0) ? averageGrade/marks.length : 0;
    }

    public void print() {
        if(marks.length == 0) {
            System.out.print("No data");
        }
        else {
            for(int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
        System.out.println("Average: " + averageGrade);
    }
}
