/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ABC TRADERS
 */
public class Login{
    String adminname;
    String adminpass;
    String docname;
    String docpass;
    static int count=0;

    public Login() {
        this.adminname = "Admin";
        this.adminpass = "Admin@123";
        this.docname = "Doctor";
        this.docpass = "Doc@123";
    }

    public String getAdminname() {
        return adminname;
    }

   

    public String getAdminpass() {
        return adminpass;
    }

   

    public String getDocname() {
        return docname;
    }

   

    public String getDocpass() {
        return docpass;
    }

   

    public int getCount() {
        return count;
    }

   
}
