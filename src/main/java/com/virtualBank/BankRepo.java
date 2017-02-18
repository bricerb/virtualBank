package com.virtualBank;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brice on 2/17/17.
 */
public interface BankRepo extends CrudRepository<Bank, Integer> {
    Bank findByName(String name);
}
