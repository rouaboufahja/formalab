package com.example.packet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class achat {
    public static float total ;
    private String achat ;
    private Float prix ;

    public achat(String achat, Float prix) {
        this.achat = achat;
        this.prix = prix;
        total+= prix ;
    }

    public String getAchat() {
        return achat;
    }

    public Float getPrix() {
        return prix;
    }

    public void setAchat(String achat) {
        this.achat = achat;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }
}