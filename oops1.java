class base {

 int x;

 public int getx() {

 return x;

 }

 public void setx(int x) {

 this.x = x ;

 }
}

class derived extends base {

 int y ;

 public int gety() {

 return y;
 }

 public void sety(){

 this.y = y;
 }
 
}



public class oops1 {

 public static void main (String [] args ) {

 base b = new base();

 b.setx(45);
System.out.println(b.getx());

 derived d = new derived();

 d.sety(456);

 System.out.println(d.gety());

 

 }
}
 