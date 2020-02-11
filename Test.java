Class Test {

Class Single {

private static Single s = new Single();

private Single(){}

public static Single getInstance() {
    
    return s;
}

}


Class Single2 {

private static Single2 = null;

private Single2(){}

public static Single2 getInstance(){
 if (s==null) {
     s=new Single2();
 }
 return s;
}

}



public static void main (String[] arg) {
    System.out.print("HelloWord");
}