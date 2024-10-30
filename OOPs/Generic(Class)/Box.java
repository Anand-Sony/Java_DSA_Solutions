// generic class is a class that can work with differecnt type of the objects,
// instead of specifying type when defining the class

public class Box<T> { // T is type parameter
    private T content; // content is variable and T is type

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

}