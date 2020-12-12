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
public class Subroutine extends Routine{
    protected int sb_id;
    private String date;
    private String time;

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Subroutine(int sb_id, String date, String time, int r) {
        
        this.sb_id = sb_id;
        this.date = date;
        this.time = time;
        this.r_id=r;
    }
    
        public boolean set_routine(int rid,int srid) {
		if(r_id.equals(rid) && sb_id.equals(srid))
			return true;
			else
				return false;
        }
    }

