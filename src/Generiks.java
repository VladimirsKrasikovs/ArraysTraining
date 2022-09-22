public class Generiks <T> implements Retriever<T>{

    private T data;

    public Generiks (T data){
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

    @Override
    public T retrieveData() {
        return this.data;
    }

}
