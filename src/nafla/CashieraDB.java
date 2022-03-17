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
public class CashieraDB {
    private String CName;
    private String CNumber;
    private String Cid;

    /**
     * @return the CName
     */
    public String getCName() {
        return CName;
    }

    /**
     * @return the CNumber
     */
    public String getCNumber() {
        return CNumber;
    }

    /**
     * @return the Cid
     */
    public String getCid() {
        return Cid;
    }

    /**
     * @param CName the CName to set
     */
    public void setCName(String CName) {
        this.CName = CName;
    }

    /**
     * @param CNumber the CNumber to set
     */
    public void setCNumber(String CNumber) {
        this.CNumber = CNumber;
    }

    /**
     * @param Cid the Cid to set
     */
    public void setCid(String Cid) {
        this.Cid = Cid;
    }
     public void CashieraDB (CashieraDB obj) {
           String SQL;
        SQL = "Insert into Cashiera values ('"             
                
                +obj.CName+"','"   
                +obj.CNumber+"','"   
                +obj.Cid+"')";
        
        System.out.println("" + SQL);
        dbconnection objcon = new dbconnection();
        
        try {
            objcon.insertvalues(SQL);
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
        }
    }
    
}
