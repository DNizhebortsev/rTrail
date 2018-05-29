package io.khasang.rtrail.service;

import io.khasang.rtrail.entiry.Cat;

import java.util.List;

public interface CatService {

    /**
     * metod for add cat
     *
     * @param cat = new cat for creation
     * @return created cat
     */
    Cat addCat(Cat cat);

    /**
     * metod for getting cat
     *
     * @param id = cat's id for getting
     * @return cat by id
     */
    Cat getCatById(long id);

    /**
     * metod for getting all cats
     *
     * @return all cats
     */
    List<Cat> getAllCats();
}
