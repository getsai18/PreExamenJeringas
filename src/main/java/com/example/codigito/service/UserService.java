package com.example.codigito.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.example.codigito.dto.CreateUserDao;
import com.example.codigito.model.User;

public class UserService {

    private final Map<Long,User> storage = new LinkedHashMap<>();
    private final AtomicLong idGen = new AtomicLong(1);

    //contructor para valores iniciales
    public UserService(){
        save(new CreateUserDao("Getsai", 18, "Hombre"));
        save(new CreateUserDao("Juan", 18, "Hombre"));
        save(new CreateUserDao("Maria", 15, "Mujer"));
    }

    public User save(CreateUserDao dao){
        Long id = idGen.getAndIncrement();
        User u = new User(id, dao.getNombre(), dao.getEdad(), dao.getGenero());
        storage.put(id, u);
        return u;
    }

    public Optional<User> findById(Long id){
        return Optional.ofNullable(storage.get(id));
    }


    

    
    public Optional<User> update(Long id, CreateUserDao dao){
        User existe = storage.get(id);
        if(existe == null) return Optional.empty();
        existe.setNombre(dao.getNombre());
        existe.setEdad(dao.getEdad());
        existe.setGenero(dao.getGenero());
        return Optional.of(existe);

    }
}
