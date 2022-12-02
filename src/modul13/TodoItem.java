package modul13;

import java.util.UUID;

public class TodoItem {
    private String id;
    private String item;
    private boolean state;

    public TodoItem(String id, String item, boolean state){
        this.id = id;
        this.item = item;
        this.state = state;
    }

    public TodoItem(String item){
        id = UUID.randomUUID().toString();
        this.item = item;
        state = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String toString(){
        return id.substring(0, 5) + " - " + item;
    }
}
