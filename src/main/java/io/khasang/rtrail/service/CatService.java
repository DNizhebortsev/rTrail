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

    /**
     * metod for delet cat
     *
     * @param id = cat's id for deleting
     * @return delete cat
     */
    Cat deleteCat(long id);

    /**
     * metod for getting all cats by name
     *
     * @param name = filter
     * @return all cats by name
     */
    List<Cat> getCatsByName(String name);

    /**
     * metod for update cat
     *
     * @param cat = new cat for update
     * @return update cat
     */
    Cat updateCat(Cat cat);
}
