package com.example.zthsystem.simpleform.service;


import com.example.zthsystem.simpleform.model.UsersModel;
import com.example.zthsystem.simpleform.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }


    public UsersModel registerUser(String email, String password, boolean baned, Integer permissonFK){
        if(email != null && password != null){
            return null;
        }else{
            UsersModel usersModel = new UsersModel();
            usersModel.setEmail(email);
            usersModel.setPassword(password);
            usersModel.setBaned(baned);
            usersModel.setPermissionFK(permissonFK);
            return usersRepository.save(usersModel);
        }
    }
    public UsersModel authenticate(String email, String passsword){
        return usersRepository.findByLoginAndPassword(email, passsword).orElse(null);
    }
}
