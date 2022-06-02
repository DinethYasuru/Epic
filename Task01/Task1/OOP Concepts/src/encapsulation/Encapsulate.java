/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Date;

/**
 * @author dinet
 */
public class Encapsulate {
    private String stu_name;
    private int stu_id;
    private int stu_mob;
    private Date dtu_dob;

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getStu_mob() {
        return stu_mob;
    }

    public void setStu_mob(int stu_mob) {
        this.stu_mob = stu_mob;
    }

    public Date getDtu_dob() {
        return dtu_dob;
    }

    public void setDtu_dob(Date dtu_dob) {
        this.dtu_dob = dtu_dob;
    }


}
