package edu.imdadia.alumnus.repository;

import edu.imdadia.alumnus.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface AdminRepo extends JpaRepository<AdminEntity, Integer> {
        List<AdminEntity> findAll();
        Optional<AdminEntity> findByAdminNameIgnoreCase(String Name);
        Optional<AdminEntity> findByAdminNameIgnoreCaseAndFatherNameIgnoreCase(String name, String fatherName);
        Optional<AdminEntity> findByAdminId(Integer id);

        Optional<AdminEntity> findByAdminNameIgnoreCaseAndPassword(String name, String password);
        Optional<AdminEntity> findByIdCardNumber(Integer idNumber);
        Optional<AdminEntity>deleteByUserName(String userName);
        Optional<AdminEntity>deleteByAdminNameIgnoreCaseAndIdCardNumber(String userName,Integer idCard);

        Optional<AdminEntity>findByUserName(String name);


}
