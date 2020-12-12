/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Class;

/**
 *
 * @author pritha
 */
public class Routine {
    protected int r_id;
    public String purpose;
    public String type;
    User u_id1;
    Routine(int r,String p,String t,int ui){
       this.r_id=r;
       this.purpose=p;
       this.type=t;
      
    }
    public boolean setroutine(User u1,String rid) {
		if(u_id1.equals(u1) && r_id.equals(rid))
			return true;
			else
				return false;
    
    
    
    
}
}