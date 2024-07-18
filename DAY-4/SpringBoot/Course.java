package SpringBoot.demo;

public class Course {
    private int id;
    private String name;
    private String author;

    public Course(int id,String name,String author){
        this.id = id;
        this.name=name;
        this.author=author;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public String toString(){
        return "Course detail: id: "+id+" name: "+name+" author: "+author;
    }
}
