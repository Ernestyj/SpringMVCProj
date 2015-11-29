package com.eugene.model.db;

import com.eugene.model.entity.Spittle;

import java.util.List;

/**
 * Created by DCLab on 11/19/2015.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}
