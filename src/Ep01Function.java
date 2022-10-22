import javax.swing.*;

public class Ep01Function
{
    public boolean check(String input)
    {
       try{
           double x=Double.parseDouble(input);
           if(x>=0 || x<0);
            return true;
       }
       catch(NumberFormatException e) {return false;}//выдать фолс при неконтролируемом исключении

    }

    public void dollarToNok(double Minput)
    {
        double nok = Minput*8.2;
        JOptionPane.showMessageDialog(null,"Amount of Nok: "+nok+"kr");
        //Метод для отрисовки на приложении отношение доллара к норвержской кроне
    }

    public void dollarToJPY(double Minput)
    {
        double JPY = Minput*112.7;
        JOptionPane.showMessageDialog(null,"Amount of JPY: "+JPY+"Yen");
        //Метод для отрисовки на приложении отношение доллара к юаню
    }
}
