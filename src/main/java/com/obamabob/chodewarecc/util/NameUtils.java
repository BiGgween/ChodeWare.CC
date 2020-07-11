package com.obamabob.chodewarecc.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NameUtils {
    List<String> names = new ArrayList<>();
    public NameUtils() {
        try {
            URL pastebin = new URL("https://pastebin.com/raw/NBGrUPtB");
            BufferedReader in = new BufferedReader(new InputStreamReader(pastebin.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                names.add(inputLine);
            }
        } catch (Exception e) {}
    }

    public boolean isChodia(String name){
        return names.contains(name);
    }
}
