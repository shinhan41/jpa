package ex;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory f = Persistence.createEntityManagerFactory("jpa");
        EntityManager m = f.createEntityManager();
        EntityTransaction t = m.getTransaction();
        t.begin();


        try{

            Member m1 = new Member();
            m1.setName("Mike");
            m.persist(m1);

            Team t1 = new Team();
            t1.setName("Team 1");
            m.persist(t1);

            Locker key = new Locker();
            key.setName("firstKey");
            key.setMember(m1);
            m.persist(key);

            t1.addMember(m1);

            t.commit();
        }catch (Exception e){

        }finally {
            m.close();
        }
        f.close();


    }
}
