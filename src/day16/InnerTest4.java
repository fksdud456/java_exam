package day16;
interface Testable {
   final static String fs = "Interface Test";
   abstract void output(String s);
}
public class InnerTest4 {
   void pr(Testable o) {
      o.output("Test");
      System.out.println(Testable.fs);
      //System.out.println(o.su); // 자손에서 추가된 멤버는 접근할 수 없다.
   }
   public static void main(String args[]) {
      System.out.println("Main start !!");
      InnerTest4 n = new InnerTest4();
      // 이 이름 없는 Inner 클래스는 Testable 와 Object 의 자손이 된다.
      n.pr(new Testable() {
         int su = 100;
         public void output(String s) {
            System.out.println("Anonymous Class : " + s);
            System.out.println("Anonymous Class : " + su);
         }				
      });			
   }	
}	
