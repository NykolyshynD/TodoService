package com.example.todoservice.crud.impl;

import com.example.todoservice.crud.Crud;
import com.example.todoservice.dao.MassageEntityDao;
import com.example.todoservice.models.MassageEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MassageCrudImpl implements Crud<MassageEntity> {

    private MassageEntityDao userMassageDao;

    @Override
    public void save(MassageEntity o) {
        double firstNumbersInUserMassageId = Math.random() * 233 * 5;
        double secondNumbersInUserMassageId = Math.random() * 233 * 5;
        o.setId(firstNumbersInUserMassageId + "" + o.getUserWhoSendMassage().getName() + "" + o.getMassage() + secondNumbersInUserMassageId);
        userMassageDao.save(o);
    }

    @Override
    public void delete(MassageEntity o) {
        userMassageDao.delete(o);
    }

    @Override
    public void update(MassageEntity o) {
        userMassageDao.save(o);
    }
}
