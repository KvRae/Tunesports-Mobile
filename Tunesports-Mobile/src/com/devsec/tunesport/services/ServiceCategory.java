package com.devsec.tunesport.services;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import com.devsec.tunesport.entities.Category;
import com.devsec.tunesport.entities.Reservation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceCategory {

    public ArrayList<Category> cat;
    public static ServiceCategory instance = null;
    public boolean resultOK;
    private ConnectionRequest req;



    private ServiceCategory() {
        req = new ConnectionRequest();
    }

    public static ServiceCategory getInstance() {
        if (instance == null) {
            instance = new ServiceCategory();
        }
        return instance;
    }


    public ArrayList<Category> parseCoupons(String jsonText) {
        try {
            cat = new ArrayList<>();
            JSONParser j = new JSONParser();
            Map<String, Object> categoryListJson
                    = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));

            List<Map<String, Object>> list = (List<Map<String, Object>>) categoryListJson.get("root");
            for (Map<String, Object> obj : list) {
                Category c = new Category();
                float id = Float.parseFloat(obj.get("id").toString());
                c.setId((int) id);
                String name_cat = obj.get("name_cat").toString();
                c.setNomCat(name_cat);
                String desc = obj.get("code").toString();
                c.setDescCat(desc);


                cat.add(c);
            }

        } catch (IOException ex) {

        }
        return cat;
    }


}
