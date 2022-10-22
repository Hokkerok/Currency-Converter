import javax.swing.*;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Object[] option1 = {"NOK","Yen","Quit"};
        Object[] option2 = {"Try again","Quit"};

        while (true)
        {        Ep01Function f =new Ep01Function();//создаем обьект класса Ep01Function
            String input = JOptionPane.showInputDialog(null,"Enter value: ");
            /**Создал переменную инпут присвоил ей значение класса обертки и вызвал функцию
             parseDouble() Которая принимает стринг и возвращает double
             внутри которой вызывается метод обьекта
             JOptionPane() (Для вывода в графический интерфейс приложения разнообразной информации и выбора простых данных)
             showInputDialog() принимающий в себя нул и стринг */
            System.out.println(input);


         if (f.check(input) == true)
         {
             double Minput= Double.parseDouble(input);
             int choice1 = JOptionPane.showOptionDialog(null,"Choose which Currency You wish Convert",
                     "Currency Converter",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,option1,option1[2]);

             if(choice1 ==0){
                 f.dollarToNok(Minput);
                 int choice2=JOptionPane.showOptionDialog(null, "What do you whish to do?", "Currency Converter",
                         JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,option2,option2[1]);
                 if(choice2 ==0){

                 }else {break;}
             }else if (choice1 ==1)  {
                 f.dollarToJPY(Minput);
                 int choice2=JOptionPane.showOptionDialog(null, "What do you whish to do?", "Currency Converter",
                         JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,option2,option2[1]);
                 if(choice2 ==0){

                 }else {break;}
             }else {break;}

         }
         else {
         JOptionPane.showMessageDialog(null, "Invalid Output, try again");
         int choice2=JOptionPane.showOptionDialog(null, "What do you whish to do?", "Currency Converter",
                 JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null,option2,option2[1]);
             if(choice2 ==0){

             }else {break;}
         }
         }
        }




    }
