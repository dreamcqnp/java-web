package com.itheima.domain;

public class course {
    private int id;
    private String name;
    private int hours;
    private String schools;
    public int getId()  {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName()  {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getHours()  {
        return hours;
    }
    public void setHours(int hours) {
        this.hours=hours;
    }
    public String getSchools()  {
        return schools;
    }
    public void setSchools(String schools) {
        this.schools=schools;
    }
//    public void insert()
    @Override
    public String toString(){
        final StringBuffer sb=new StringBuffer("course{");
        sb.append("id=").append(id);
        sb.append(",name='").append(name).append('\'');
        sb.append(",hours=").append(hours);
        sb.append(",schools='").append(schools).append('\'');
        sb.append("}");
        return sb.toString();
    }
}