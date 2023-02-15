/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Control;

import Connect.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Ani;
import model.User;

/**
 *
 * @author 84384
 */
public class GetInfor {

    Query getQuery = new Query();
    Connection cnn = new connect2().getConnection(new Control.Query().DataBaseName);

    public ArrayList<User> GetAllUser() {
        ArrayList<User> UserList = new ArrayList<>();
        try {
            String Query = getQuery.getAllUserInfor();
            Connection cnn = new connect2().getConnection(new Control.Query().DataBaseName);
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            System.out.println("QR4");
            while (rs.next()) {
                System.out.println("check:" + rs.getString(1));
                UserList.add(new User(rs.getString(1), rs.getDate(2) + "", rs.getNString(3) + "", rs.getString(4) + "", rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return UserList;
    }
    public double[] getPrice(String id){
        double[] price = {0.0, 0.0, 0.0, 0.0};
        try {
            PreparedStatement ps= cnn.prepareStatement(getQuery.get_price_according_ani_id());
            ResultSet rs= ps.executeQuery();
            ps.setString(1, id);
            rs.next();
            price[0]= rs.getDouble(1);
             price[1]= rs.getDouble(2);
              price[2]= rs.getDouble(3);
            price[3] = rs.getDouble(4);
        } catch (Exception e) {
        }
       return price;
    }
    public ArrayList<String> getImgUrl(String id){
        ArrayList<String> imgList= new ArrayList<>();
        try {
            PreparedStatement ps= cnn.prepareStatement(getQuery.get_link_img_according_ani_id());
            ps.setString(1, id);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                imgList.add(rs.getString(1).trim());
            }
        } catch (Exception e) {
        }
        return imgList;
    }
    public ArrayList<Ani> GetAllAni(String type) {
        ArrayList<Ani> AniList = new ArrayList<>();
        try {
            String Query = getQuery.getAllAnimal(type);
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            System.out.println("QR4");
           
            while (rs.next()) {
//                System.out.println("check:" + rs.getString(1));
                ArrayList<String> img_url = new ArrayList<>();
                double[] price = {0.0, 0.0, 0.0, 0.0};
                Ani ani = new Ani();
                ani.setId_ani(rs.getString(1).trim());
                ani.setName_cat(rs.getString(2).trim());
                ani.setScient_name(rs.getString(3).trim());
                ani.setName_ani(rs.getString(4).trim());
                ani.setPrice(getPrice(rs.getString(1)));
                ani.setImg_url(getImgUrl(rs.getString(1)));
                AniList.add(ani);
//                System.out.println(ani.toString());
            }
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return AniList;
    }

    public static void main(String[] args) {

    }
}
