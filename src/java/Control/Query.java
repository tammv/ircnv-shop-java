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

    public String getAllAnimal(){
        return  "select b.name_cat, (TRIM(c.name_genus)+' '+TRIM(a.name_species)) as scienct_name, a.name_ani from ani a inner join cat b on b.id_cat = a.id_cat inner join dbo.Genús c on c.id_genus = a.id_genus";
    }
    public String getSpecAnimal(){
        return "";
    }
}
