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
public class Diposite {
   private String AccountdNumber;
   private String AccountdName;
   private String AccountdType;
   private String dAmount;

    /**
     * @return the AccountdNumber
     */
    public String getAccountdNumber() {
        return AccountdNumber;
    }

    /**
     * @return the AccountdName
     */
    public String getAccountdName() {
        return AccountdName;
    }

    /**
     * @return the AccountdType
     */
    public String getAccountdType() {
        return AccountdType;
    }

    /**
     * @return the dAmount
     */
    public String getdAmount() {
        return dAmount;
    }

    /**
     * @param AccountdNumber the AccountdNumber to set
     */
    public void setAccountdNumber(String AccountdNumber) {
        this.AccountdNumber = AccountdNumber;
    }

    /**
     * @param AccountdName the AccountdName to set
     */
    public void setAccountdName(String AccountdName) {
        this.AccountdName = AccountdName;
    }

    /**
     * @param AccountdType the AccountdType to set
     */
    public void setAccountdType(String AccountdType) {
        this.AccountdType = AccountdType;
    }

    /**
     * @param dAmount the dAmount to set
     */
    public void setdAmount(String dAmount) {
        this.dAmount = dAmount;
    }
     public void Diposite (Diposite obj) {
           String SQL;
        SQL = "Insert into Diposite values ('"             
                +obj.AccountdNumber+"','"
                +obj.AccountdName+"','"   
                +obj.AccountdType+"','"   
                +obj.dAmount+"')";
        
        System.out.println("" + SQL);
        dbconnection objcon = new dbconnection();
        
        try {
            objcon.insertvalues(SQL);
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
        }
    }
}
