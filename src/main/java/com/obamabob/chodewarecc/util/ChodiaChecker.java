package com.obamabob.chodewarecc.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChodiaChecker {
    List<String> thing = new ArrayList<>();
    public ChodiaChecker(){
        try {
            URL pastebin = new URL("https://pastebin.com/raw/irGZgpdn");
            BufferedReader in = new BufferedReader(new InputStreamReader(pastebin.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                thing.add(inputLine);
            }
        } catch(Exception e){}
    }

    public boolean isChodia(String e){
        return thing.contains(e);
    }
}
