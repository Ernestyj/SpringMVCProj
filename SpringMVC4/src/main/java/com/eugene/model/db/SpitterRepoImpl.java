package com.eugene.model.db;

import com.eugene.model.entity.Spitter;
import org.springframework.stereotype.Component;

/**
 * Created by DCLab on 11/20/2015.
 */
@Component
public class SpitterRepoImpl implements SpitterRepository{

    private Spitter spitter = null;
    @Override
    public void save(Spitter spitter) {
        this.spitter = spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return this.spitter;
    }
}
