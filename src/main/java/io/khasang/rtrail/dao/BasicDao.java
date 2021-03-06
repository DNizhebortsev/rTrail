package io.khasang.rtrail.dao;


import io.khasang.rtrail.entiry.Cat;
import org.hibernate.Session;

import java.util.List;

/**
 * metod for add entity
 * new entity for creation
 */


public interface BasicDao<T> {
    T create(T entity);

    /**
     * metod for getting entity
     *
     * @param id = entity's id for getting
     * @return entity by id
     */
    T getById(long id);

    /**
     * metod for getting all entity
     *
     * @return all entity
     */
    List<T> getList();

    /**
     * for getting session factory
     */
    Session getSessionFactory();

    /**
     * metod for deleted cat
     *
     * @param entityForDelete = entityFordelete's id for deleting
     * @return delete entityFordelete
     */
    T delete(T entityForDelete);

    /**
     * metod for update entity
     * new entity for update
     */

    T update(T entity);
}
