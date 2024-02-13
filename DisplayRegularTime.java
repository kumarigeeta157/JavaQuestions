import org.xml.sax.helpers.AttributesImpl;

import java.util.Arrays;

public class DisplayRegularTime {

    private int hour;
    private int minute;
    private int second;
     public void setTime(int h, int m ,int s){
         hour = ((h >= 0 && h<24) ? h:0);
         minute = ((m >= 0 && m<60) ? m:0);
         second = ((s >= 0 && s<60) ? s:0);

     }

     public String toMilitary(){
         return String.format("%2d:%2d:%2d" , hour,minute,second);
     }

     public String toString(){
         return String.format("%2d:%2d:%2d %s",(hour == 0 || hour ==12)?12:hour%12 , minute , second,(hour<12 ? "AM" : "PM"));
     }

    public static void main(String[] args) {
        DisplayRegularTime timeObject = new DisplayRegularTime();
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toString());

        timeObject.setTime(13,45,55);
        System.out.println(timeObject.toMilitary());
        System.out.println(timeObject.toString());
    }



}
