package cn.web.dao;

import cn.web.domain.Linkman;
import cn.web.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * Created by Taeyeon-Serenity on 2017/4/9.
 */
public class LinkmanDao {
    public void save(Linkman man) {
        Session session = HibernateUtils.getCurrentSession();
        session.save(man);
    }
}
