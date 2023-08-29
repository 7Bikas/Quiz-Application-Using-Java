import java.util.*;
import java.sql.*;
public class geography {
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
            String sql="Select question from geography where id=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, "1");
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Maxico\t\t2.South Africa\n3.India\t\t\t4.China");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "1");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
             sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "2");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Amazon\t\t2. Koshi\n3.Nile\t\t\t4.Brahamputra");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "2");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "3");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Maxico\t\t\t2. England\n3.Turkey\t\t\t4.North America");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "3");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "4");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Seoul\t\t\t2. Bangkok\n3.Jakarta\t\t4.Tokyo");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "4");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "5");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Asia\t\t\t2. Europe\n3.Austrilia\t\t4.Africa");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "5");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "6");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.China\t\t\t2. South Africa \n3.India\t\t\t4.Russia");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "6");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "7");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.England\t\t2. Norway\n3.Japan\t\t\t4.Walse");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "7");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "8");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Himalayas\t\t\t2. Andes\n3.Karakoram\t\t\t4.Hindu Kush");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "8");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "9");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Damodhar\t\t\t2. Ganga\n3.Godavari\t\t\t4.Brahamputra");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "9");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from geography where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "10");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Beijing Capital International Airport\n2.Hartsfield-Jackson Atlanta International Airport\n3.Los Angeles International Airport \n4.Tokyo's Haneda Airport");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from geography where id=?";
                    ps3= con.prepareStatement(ans);
            ps3.setString(1, "10");
             rs3=ps3.executeQuery();
            if(rs3.next()){
                
                System.out.println("Answer : "+rs3.getString(1));
               }
               }
                System.out.println("------------------------------------------------------------------------------");
            }
            
            
            System.out.println("***Congratulation***");
            System.out.println("You scored "+count+" out of 50.");
            
        }catch(SQLException se){
            System.out.println(se);
        }
    }
}
