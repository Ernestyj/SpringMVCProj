package com.eugene.model.db;

import com.eugene.model.entity.Spitter;

/**
 * Created by DCLab on 11/20/2015.
 */
public interface SpitterRepository {
    void save(Spitter spitter);
    Spitter findByUsername(String username);
}
