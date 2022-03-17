/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nafla;

/**
 *
 * @author hnd
 */
public class addaccountDB {
    
    private String CustomerId;
    private String Fname;
    private String Lname;
    private String address;
    private String Phone;
    private String Email;

    /**
     * @return the CustomerId
     */
    public String getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * @return the Fname
     */
    public String getFname() {
        return Fname;
    }

    /**
     * @param Fname the Fname to set
     */
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    /**
     * @return the Lname
     */
    public String getLname() {
        return Lname;
    }

    /**
     * @param Lname the Lname to set
     */
    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
     
    public void addaccount (addaccountDB obj) {
           String SQL;
        SQL = "Insert into addaccount values ('"
                +obj.CustomerId+"','"
                +obj.Fname+"','" 
                +obj.Lname+"','"
                +obj.address+"','"   
                +obj.Phone+"','"   
                +obj.Email+"')";
        
        System.out.println("" + SQL);
        dbconnection objcon = new dbconnection();
        
        try {
            objcon.insertvalues(SQL);
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
        }
    }
            
}
