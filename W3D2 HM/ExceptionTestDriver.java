/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3;

/**
 *
 * @author Gude
 */
public class ExceptionTestDriver {

    public static void main(String[] args) {
        try {
            doThingA();
      // }catch (Exception ex){
            //     ex.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void doThingA() throws MyException {
        doThingB();
    }

    /**
     *
     */
    public static void doThingB() {
     try {
         doThingC();
     } catch (MyException e){
            System.out.println("Finally we're doing it") ;
}}finally{
        System.out.print("we did it!!");
        }
        }

    public static void doThingC() throws MyException {
        doThingD();
    }

    public static void doThingD() throws MyException {
        throw new MyException("a message");

    }

    private void MyException(String didnt_really_want_to_deal_with_it, MyException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
