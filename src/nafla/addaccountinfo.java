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
public class addaccountinfo {
   private String AccountNumber;
   private String AccountName;
   private String Salary;
   private String AccountType;

    /**
     * @return the AccountNumber
     */
    public String getAccountNumber() {
        return AccountNumber;
    }

    /**
     * @return the AccountName
     */
    public String getAccountName() {
        return AccountName;
    }

    /**
     * @return the Salary
     */
    public String getSalary() {
        return Salary;
    }

    /**
     * @return the AccountType
     */
    public String getAccountType() {
        return AccountType;
    }

    /**
     * @param AccountNumber the AccountNumber to set
     */
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    /**
     * @param AccountName the AccountName to set
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    /**
     * @param AccountType the AccountType to set
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }
    public void addaccountinfo(addaccountinfo obj) {
           String SQL;
        SQL = "Insert into addaccountinfo values ('"
                +obj.AccountNumber+"','"
                +obj.AccountName+"','" 
                +obj.Salary+"','"             
                +obj.AccountType+"')";
        
        System.out.println("" + SQL);
        dbconnection objcon = new dbconnection();
        
        try {
            objcon.insertvalues(SQL);
        } catch (Exception ex) {
            System.out.println(""+ex.toString());
        }
    }
}
