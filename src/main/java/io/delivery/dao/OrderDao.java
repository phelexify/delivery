package io.delivery.dao;

import io.delivery.entity.BasketUnit;
import io.delivery.entity.Order;

import java.util.List;

public interface OrderDao extends BasicDao<Order> {

    /**
     * Find orders in database by userID
     *
     * @param uid - userID
     * @return list of orders
     */
    List<Order> findByUserId(long uid);

    /**
     * Receive basketUnitList from db
     *
     * @return basketUnitList
     */
    BasketUnit getBasketUnitListById(long id);

    /**
     * Delete basketUnit from db by ID
     *
     * @param id - basketUnit ID
     * @return - deleted basketUnit
     */
    int deleteBasketUnitById(long id);
}
