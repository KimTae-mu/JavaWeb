package cn.web.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Taeyeon-Serenity on 2017/3/22.
 */
public class HibernateUtils {
    private static final Configuration CONFIG;
    private static final SessionFactory FACTORY;

    //编写静态代码块
    static {
        //加载xml的配置文件
        CONFIG=new Configuration().configure();
        //构建工厂
        FACTORY=CONFIG.buildSessionFactory();
    }

    public static Session getSession(){
        return FACTORY.openSession();
    }
}
