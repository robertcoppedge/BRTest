package brtest.shows;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import brtest.assets.asset;

public class show {
    int ID;
    String name;
    String description;
    Collection<asset> assets;

    public show (int ID, String name, String description)
    {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.assets = new ArrayList<asset>();
    }

    public void addAsset(asset asset)
    {
        this.assets.add(asset);
    }

    public Collection<asset> getAssets(String type, String expiration)
    {
        Stream<asset>  retList;
        retList = this.assets.stream();
        if (type!=null)
            retList = retList.filter(line -> line.type.matches(type));
        if (expiration!=null)
            try {
                Date exp =  new SimpleDateFormat("MM/dd/yyyy").parse(expiration);
                retList = retList.filter(line -> !line.expires.before(exp));
            }
            catch (ParseException pe) {
                System.out.println("Parse Exception in show.getAssets: " + pe.getMessage());
            }
        return retList.collect(Collectors.toList());
    }

}
