package com.obamabob.chodewarecc.util;

import com.obamabob.chodewarecc.Bruh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class VersionChecker {
    int ver = Bruh.getInstance().VERSION;
    int ver1 = 0;

    public VersionChecker(){
        try {
            URL pastebin = new URL("https://github.com/7OU/chodiaware-names/raw/master/latest.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(pastebin.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                ver1 = Integer.parseInt(inputLine);
            }
        } catch(Exception e){}
    }

    public boolean isUpToDate() {
        if (ver1 <= ver) return true;
        else return false;
    }
}
