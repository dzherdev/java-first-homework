package homeworks.lists.grouping.entities;

import java.util.Objects;

public class Type {

    private String title;
    private Integer id;

    public Type(String title,Integer id){
        this.title=title;
        this.id=id;
    }

    public String getTitle(){
        return this.title;
    }

    public Integer getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setId(Integer id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "Type{" +
            "id='" + id + '\'' +
            "title='" + title + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(title, type.title) &&
            Objects.equals(id, type.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id);
    }
}
