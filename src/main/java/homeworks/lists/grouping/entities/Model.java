package homeworks.lists.grouping.entities;

public class Model {

    private String title;

    public Model(String title){
        this.title=title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return "Model{" +
            "title='" + title + '\'' +
            '}';
    }

}
