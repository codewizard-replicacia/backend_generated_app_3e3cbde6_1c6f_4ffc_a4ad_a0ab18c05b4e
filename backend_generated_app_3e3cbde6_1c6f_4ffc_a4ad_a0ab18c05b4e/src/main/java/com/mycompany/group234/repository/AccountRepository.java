package com.mycompany.group234.repository;


import com.mycompany.group234.model.Account;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AccountRepository extends SimpleJpaRepository<Account, String> {
    private final EntityManager em;
    public AccountRepository(EntityManager em) {
        super(Account.class, em);
        this.em = em;
    }
    @Override
    public List<Account> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Account\"", Account.class).getResultList();
    }
}