/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Control;

/**
 *
 * @author 84384
 */
public class Query {
    public String DataBaseName= "SpiderShop123";
    public String getAllAnimal(String type) {
        String typeID = "";
//        switch (type) {
//            case "Spider":
//                typeID = "CAT001";
//                break;
//            case "Frog":
//                typeID = "CAT002";
//                break;
//            case "Snake":
//                typeID = "CAT003";
//                break;
//            case "Sscopion":
//                typeID = "CAT004";
//                break;
//            default:
//                throw new AssertionError();
//        }
        return "select trim(a.id_ani), trim(c.name_cat), (trim(b.name_genus)+' '+trim(a.name_species)) as scient_name, trim(a.name_ani)\n"
                + "from dbo.Ani a\n"
                + "inner join dbo.Genus b on b.id_genus = a.id_genus\n"
                + "inner join cat c on c.id_cat = a.id_cat";
    }

    public String get_price_according_ani_id() {
        return "select sling, semili_mature, mature_male, mature_female\n"
                + "from dbo.Prices \n"
                + "where id_ani=?";
    }

    public String get_link_img_according_ani_id() {
        return "select img.img_link\n"
                + "from dbo.Ani inner join dbo.img on img.id_ani = Ani.id_ani\n"
                + "where dbo.Ani.id_ani= ?";
    }

    public String getSpecAnimal() {
        return "";
    }

    public String getAllUserInfor() {
        return "select * from dbo.customer";
    }

    public String check_login_user_and_pass() {
        return "select user_account, user_password \n"
                + "from dbo.customer\n"
                + "where user_account= ? and user_password=?";
    }
}
