import java.util.*;
import java.sql.*;
public class history {
    public static void main(String[] args) {
        int count=0;
        String ans;
        PreparedStatement ps3;
        ResultSet rs3;
        Scanner sc= new Scanner (System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException cn){
            System.out.println(cn);
        }
        try{
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
            String sql="Select question from history where id=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, "1");
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Nepal\t\t\t2.Greenland\n3.Egypt\t\t\t4.China");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "1");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            
            String    sql1="Select question from history where id=?";
            PreparedStatement pst1= con.prepareStatement(sql1);
            pst1.setString(1, "2");
            ResultSet rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.August 26th, 55 BC\t\t\t2.November 1st, 55 BC\n3.March 26th, 55 BC\t\t\t4.May 6th, 55 BC");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "2");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");

            }
                sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "3");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Russia\t\t\t2.Great Britain\n3.France\t\t\t4.Germany");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "3");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
            System.out.println("------------------------------------------------------------------------------");

            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "4");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Amazon\t\t\t2. Karnali\n3.Sapta Koshi\t\t\t4.Nile");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "4");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "5");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.George Wasington\t\t2.Abraham Lincon\n3.Barack Obama\t\t\t4.Richard Nixon");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "5");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "6");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Canada\t\t\t2. Swizerland\n3.France\t\t\t4.Japan");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "6");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "7");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.June 4\t\t\t2.February 4\n3.September 4\t\t\t4.July 4");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "7");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "8");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Abraham Lincon\t\t2. George Wasington\n3.John Adams\t\t\t4.William Henry Harrison");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "8");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "9");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Mohandas Karamchand Ghandhi\t\t2.Harilal Ghandhi\n3.Manilal Ghandhi\t\t\t4.Mahatma Ghandhi");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "9");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "10");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Zeno\t\t\t\t2.John viii\n3.Flavius Romulus Augustus\t4.Theodore Laskaris");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "10");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "11");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Louis xvi\t\t\t2. Charles ll\n3.Louis ii\t\t\t4.Lothair");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "11");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "12");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.338 BC\t\t\t2. 339 BC\n3.336 BC\t\t\t4.337 BC");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "12");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "13");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.March 31, 1600\t\t\t2. January 31, 1600\n3.December 31, 1600\t\t\t4.March 31, 1600");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "13");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "14");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.My Journey\t\t\t2. Yours Faith\n3.Sapta Rishi\t\t\t4.Mein Kampf");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "14");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql1="Select question from history where id=?";
             pst1= con.prepareStatement(sql1);
            pst1.setString(1, "15");
             rs1=pst1.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                System.out.println("choices are :");
                System.out.println("1.28 July 1914-11 Nov 1918\t\t\t2. 28 July 1915-11 Nov 1919\n3.8 July 1914-1 Nov 1918 \t\t\t4.28 July 1941-11 Nov 1945");
                System.out.println("Enter one of the above options :");
                int a1=sc.nextInt();
               if(a1==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from history where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "15");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
              System.out.println("------------------------------------------------------------------------------");

            }
            System.out.println("***Congratulation***");
            System.out.println("You scored "+count+"Out of 75");
            
        }catch(SQLException se){
            System.out.println(se);
        }
    }
    
}


