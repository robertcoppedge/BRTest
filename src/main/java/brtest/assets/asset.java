package brtest.assets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class asset {
    public int ID;
    public String name;
    public String type;
    public String url;
    public Date expires;

    public asset (int ID, String name, String type, String url, String expires)
    {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.url = url;
        try {
            this.expires = new SimpleDateFormat("MM/dd/yyyy").parse(expires);
        }
        catch (ParseException pe) {
            System.out.println("Parse Exception in asset contructor: " + pe.getMessage());
        }
    }

    public String GetDisplayLine()
    {
        return "(" + this.ID + ") <a href=\"" + this.url + "\" target=\"blank\">" + this.name + "</a> [" + this.type + " Expires: " + this.expires.toString() + "]";
    }
}
