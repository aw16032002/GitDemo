class myemployee{

private int id ;
private String name ;

public void setid(int i){

  id = i; }
 
public int getid() {

 return id ;  }

 public String getname() {

 return name ;  }

 public void setname (String n ){

 name = n;  }
}




public class oops {

  public static void main (String [] args ) {

  myemployee harry = new myemployee();

  harry.setname("aditya");

  harry.setid(4);

  System.out.println(harry.getname());
  System.out.println(harry.getid());

}
}

   