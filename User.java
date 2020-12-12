
 /** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
package User_Class;

/**
 *
 * @author prithass
 */
public class User {
    
    public String fullname;
    protected String email;
    private String username  ;
	private String password  ;
        protected  int u_id;
          public String gender;
           public String country;
            public String location; 
  
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public User(String f, String e, String u,String p,int ui,String g,String c,String l){
            this.fullname=f;
           this. email=e;
           this. username=u;
           this. password=p;
           this. u_id=ui;
           this.gender =g;
           this.country=c;
           this.location=l;
        }

    public void User() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public boolean login(String user,String pass) {
		if(username.equals(user) && password.equals(pass))
			return true;
			else
				return false;
        }
      
        
    
}
