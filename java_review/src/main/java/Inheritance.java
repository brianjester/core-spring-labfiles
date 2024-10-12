public class Inheritance {
    public static void  main(String[] args) {
        Report report = new Report("The document.");
        report.print();
        report.setContent("Update 1.");
        report.print();
        report.print("Homework");
    }
}

interface printable {
    void print();
}

class Report implements printable {
    private String content;

    public Report(String content) {
        this.content = content;
    }
    @Override
    public void print() {
        System.out.println(content);
    }

    public void print(String header) {
        System.out.println(header +": "+content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}