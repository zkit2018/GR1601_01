package com.chengshuai.dao;


import com.chengshuai.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/11/8.
 */
public class BaseDaoImpl implements  BaseDao {
    @Override
    public void insert(Object o) {
        Session session =  HibernateUtil.getSession();
        if(session==null){
            return ;
        }
        Transaction transaction = session.beginTransaction();
        session.save(o);

        transaction.commit();
        HibernateUtil.close(session);
    }

    @Override
    public void update(Object o) {
        Session session =  HibernateUtil.getSession();
        if(session==null){
            return ;
        }
        Transaction transaction = session.beginTransaction();
        session.update(o);

        transaction.commit();
        HibernateUtil.close(session);
    }

    @Override
    public void delete(Object o) {
        Session session =  HibernateUtil.getSession();
        if(session==null){
            return ;
        }
        Transaction transaction = session.beginTransaction();
        session.delete(o);

        transaction.commit();
        HibernateUtil.close(session);
    }

    @Override
    public void insertOrUpdate(Object o) {
        Session session =  HibernateUtil.getSession();
        if(session==null){
            return ;
        }
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(o);

        transaction.commit();
        HibernateUtil.close(session);
    }
}
