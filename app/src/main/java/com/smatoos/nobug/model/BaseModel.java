package com.smatoos.nobug.model;

import java.io.Serializable;

public class BaseModel implements Serializable {

    //  ========================================================================================

    public boolean hasListField() {
        try {
            return getClass().getField("list") == null ? false : true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean toBoolean(int value) {
        return (value != 0);
    }

    public String nullToString(String item) {
        return item == null ? "" : item;
    }

}
