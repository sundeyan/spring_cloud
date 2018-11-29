package com.sun.spring_cloud.pojo;

public class Orders {
    private Long oid;
    private String oname;
    private Item item;

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", item=" + item +
                '}';
    }

    public Orders(Long oid, String oname, Item item) {
        this.oid = oid;
        this.oname = oname;
        this.item = item;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getOid() {
        return oid;
    }

    public String getOname() {
        return oname;
    }

    public Item getItem() {
        return item;
    }
}
