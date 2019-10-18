package com.tym.dao;

import com.tym.model.Picture;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PictureDao {
    public void addPicture(Picture picture) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(picture);
            transaction.commit();
        }
    }

    public List<Picture> getAll() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("From Picture").list();
        }

    }

    public Picture getPictureById(int id) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            return (Picture) session.createQuery("From Picture where id=:id").setParameter("id", id).getSingleResult();

        }
    }

    public Picture getPictureByBase64(String base64) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            return session.createQuery("From Picture where strBase64=:strBase64", Picture.class).setParameter("strBase64", base64).getSingleResult();

        }
    }

}
