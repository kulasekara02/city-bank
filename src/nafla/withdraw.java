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
public class withdraw {
   private String AccountwNumber;
   private String AccountwName;
   private String AccountwType;
   private String wAmount;

    /**
     * @return the AccountwNumber
     */
    public String getAccountwNumber() {
        return AccountwNumber;
    }

    /**
     * @return the AccountwName
     */
    public String getAccountwName() {
        return AccountwName;
    }

    /**
     * @return the AccountwType
     */
    public String getAccountwType() {
        return AccountwType;
    }

    /**
     * @return the wAmount
     */
    public String getwAmount() {
        return wAmount;
    }

    /**
     * @param AccountwNumber the AccountwNumber to set
     */
    public void setAccountwNumber(String AccountwNumber) {
        this.AccountwNumber = AccountwNumber;
    }

    /**
     * @param AccountwName the AccountwName to set
     */
    public void setAccountwName(String AccountwName) {
        this.AccountwName = AccountwName;
    }

    /**
     * @param AccountwType the AccountwType to set
     */
    public void setAccountwType(String AccountwType) {
        this.AccountwType = AccountwType;
    }

    /**
     * @param wAmount the wAmount to set
     */
    public void setwAmount(String wAmount) {
        this.wAmount = wAmount;
    }
    public void withdraw (withdraw obj) {
           String SQL;
        SQL = "Insert into Withdrawmoney values ('"             
                +obj.AccountwNumber+"','"
                +obj.AccountwName+"','"   
                +obj.AccountwType+"','"   
                +obj.wAmount+"')";
        
        System.out.println("" + SQL);
        dbconnection objcon = new dbconnection();
        
        try {
            objcon.insertvalues(SQL);
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
        }
    }
}
