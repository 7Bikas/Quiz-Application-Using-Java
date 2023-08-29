import java.util.*;
import java.sql.*;
public class sports {
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
            String sql="Select question from sport where id=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, "1");
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.2011\t\t\t2.2014\n3. 2021 \t\t4.2019");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "1");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
             sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "2");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.France\t\t\t2.Brazil\n3.Germany  \t\t\t4.Argentina");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "2");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "3");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.1970\t\t\t2.1920\n3. 1928 \t\t4.2000");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "3");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "4");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.2012 \t\t\t2. 2011\n3. 2013 \t\t4. 2014");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "4");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "5");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Ms Dhoni \t\t\t2.Shahid Afridi\n3. Birat Kholi \t\t\t4.Paras Khadka");

                
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "5");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "6");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Tonique Williams-Darling\t\t2.Christine Ohuruogu Great\n3. Sanya Richards-Ross \t\t\t4.Shaunae Miller Bahamas ");
                
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "6");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "7");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Rohit Sharma\t\t\t2.Virat Kohli\n3. Ms Dhoni \t\t\t4.Sachin Tendulkar");
               
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "7");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "8");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.En Fuego CF\t\t\t2.Rush Hour\n3.Hooligans FC\t\t\t4.Shelffied FC");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "8");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "9");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                 System.out.println("1.Vollyball\t\t\t2.Football\n3. Karate \t\t\t4.Boxing");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "9");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from sport where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "10");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Football\t\t\t2.Hockey\n3. Basketball \t\t\t4.Tennise");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from sport where id=?";
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
            System.out.println("You scored "+count+" out of 50");
            
        }catch(SQLException se){
            System.out.println(se);
        }
    }
}
