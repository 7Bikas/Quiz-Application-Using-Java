import java.util.*;
import java.sql.*;
public class science {
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
            String sql="Select question from science where id=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, "1");
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Abacus\t\t\t2.Calculator\n3.Turing Machine \t\t4.Pascaline");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                   ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "1");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
             sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "2");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Charles Babbage\t\t\t2.Blaise Pascal\n3. Alan Turing  \t\t\t4.Lee De Forest");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "2");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "3");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Charles Babbage\t\t\t2.Lee De Forest\n3. John McCarthy \t\t\t4.JP Eckert");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "3");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "4");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Bird \t\t\t2.Cancer\n3. Mammals \t\t4.Soil");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "4");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "5");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Calories\t\t\t2.Celsius\n3. Kelvin \t\t\t4.None of the above ");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "5");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "6");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Hygrometer\t\t\t2.Hydrometer\n3. Barometer \t\t\t4.Mercury Thermometer");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==1){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "6");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "7");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Hydrometer\t\t\t2.Hygrometer\n3. Lactometer \t\t\t4.Barometer");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==3){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "7");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "8");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Spectrometer\t\t\t2.Galvanometer\n3. ELectrometer \t\t4.Ohmmeter");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==4){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "8");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "9");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Animal Tissue\t\t\t2.Sea\n3. Humidity \t\t\t4.Measuring height ");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
                   ps3= con.prepareStatement(ans);
                   ps3.setString(1, "9");
                   rs3=ps3.executeQuery();
                   if(rs3.next()){
                
                   System.out.println("Answer : "+rs3.getString(1));
               }
               }
               System.out.println("------------------------------------------------------------------------------");
            }
            sql="Select question from science where id=?";
             pst= con.prepareStatement(sql);
            pst.setString(1, "10");
             rs=pst.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println("choices are :");
                System.out.println("1.Geology\t\t\t2.Geotechnics\n3. geoponics \t\t\t4.Geogony");
                System.out.println("Enter one of the above options :");
                int a=sc.nextInt();
               if(a==2){
                   count+=5;
                   System.out.println("right answer!");
               }
               else{
                   System.out.println("wrong answer!");
                    ans="Select answer from science where id=?";
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
