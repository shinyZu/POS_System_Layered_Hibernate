package lk.ijse.pos_system.repository;

import org.hibernate.Session;

public interface SuperRepo {

    void setSession(Session session);

    /*default void rollback(Session session) {
        session.getTransaction().rollback();
    }*/
}
