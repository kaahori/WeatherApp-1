package Models;

public class WEATHER {
    private int id;
    private String main;
    private String descriprion;
    private String icon;
    private String description;

    public WEATHER(int id, String main, String description, String icon){
        this.id=id;
        this.main=main;
        this.descriprion=description;
        this.icon=icon;
    }

    public int getId(){
        return id;
    }


    public void setId(int id) {
        this.id=id;
    }


    public String getMain(){
        return main;
    }


    public void setMain(String main){
        this.main=main;
    }

    public String getDescriprion()
    {
        return descriprion;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}