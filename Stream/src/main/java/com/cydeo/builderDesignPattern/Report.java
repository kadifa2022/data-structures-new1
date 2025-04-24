package com.cydeo.builderDesignPattern;

public class Report {

    // private properties
    // private constructor with parameter as Builder Object
    private String title;
    private String author;
    private String content;

    private Report(ReportBuilder builder) {
        this.title =builder.title;
        this.author = builder.author;
        this.content = builder.content;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // another builder class
    public static class ReportBuilder{
        // private properties
        // setters with returnType as ReportBuilder
        // Build() method with return object

        private String title;
        private String author;
        private String content;



        public ReportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder setAuthor(String author) {
            this.author = author;
            return this;

        }

        public ReportBuilder setContent(String content) {
            this.content = content;
            return this;
        }
        public Report build(){
            if(this.title == null){
                throw new IllegalArgumentException("Title is mandatory!!");
            }
            return new Report(this);
        }
}

}
