package com.c10udx;

import com.c10udx.entity.Admin;
import com.c10udx.utils.DBHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.util.Map;

/**
 * Hello world!
 */
public class MainApp {

    public static void main(String[] args) {
        Map<String, Object> adminMap = DBHandler.findById("admin", 1);
        System.out.println(adminMap);

        Admin admin = DBHandler.findById("admin", 1, new BeanHandler<Admin>(Admin.class));
        System.out.println(admin);

////        INSERT INTO t_user (name,nickName,password,age,height) VALUES (?,?,?,?,?)
//        int count = DBHandler.insert("insert into admin(adminAccount,adminName,adminPassword,adminRole) values(?,?,?,?)",
//                "test", "test", "	098F6BCD4621D373CADE4E832627B4F6", "7");
//        System.out.println(count);
//
////        UPDATE t_user SET name=?,nickName=?,password=?,age=?,height=? WHERE name=?
//        int update = DBHandler.update("update admin set adminName=? where id=?", "MrC10ud", 1);
//        System.out.println(update);
//
////        DELETE FROM t_user WHERE name=?
//        int delete = DBHandler.update("delete from admin where id = ?", 1);
//        System.out.println(delete);
    }

}
