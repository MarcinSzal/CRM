package CRMproject;

public class Info {

    private String info;

    public Info(String info){
        this.info = info;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String toStringg(Info info){
        return info.toString();
    }

    public static Info addNewInfo(String info){
        return new Info(info);

    }
}
