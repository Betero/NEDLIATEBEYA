package com.example.mpk;

public class Kirh {

    private String tite;
    private String des;
    private double ln,lt;
    private int img;

    public Kirh(String title, String desc, double lon, double lat, int image) {
        this.tite = title;
        this.des = desc;
        this.ln = lon;
        this.lt = lat;
        this.img = image;
    }

    public void setTite(String tite) {
        this.tite = tite;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setLn(double ln) {
        this.ln = ln;
    }

    public void setLt(double lt) {
        this.lt = lt;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTite() {
        return tite;
    }

    public String getDes() {
        return des;
    }

    public double getLn() {
        return ln;
    }

    public double getLt() {
        return lt;
    }

    public int getImg() {
        return img;
    }
}
