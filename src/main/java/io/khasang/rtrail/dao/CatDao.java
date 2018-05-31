package io.khasang.rtrail.dao;

import io.khasang.rtrail.entiry.Cat;

import java.util.List;

/**
 * metod for getting all cats by name
 *
 *
 * @return all cats by name
 */
public interface CatDao extends BasicDao<Cat> {
    List<Cat> getCatsByName(String name);
}
