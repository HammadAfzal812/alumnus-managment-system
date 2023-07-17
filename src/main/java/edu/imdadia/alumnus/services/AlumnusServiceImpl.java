package edu.imdadia.alumnus.services;

import edu.imdadia.alumnus.entity.AlumnusEntity;
import edu.imdadia.alumnus.repository.AlumnusRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnusServiceImpl implements AlumnusService {
    private final AlumnusRepo alumnusRepo;

    public AlumnusServiceImpl(AlumnusRepo alumnusRepo) {
        this.alumnusRepo = alumnusRepo;
    }

    @Override
    public List<AlumnusEntity> findAllByDistrict(String district) {
        return alumnusRepo.findByDistrict(district);
    }

    @Override
    public List<AlumnusEntity> findAllByType(String type) {

        return alumnusRepo.findByType(type);
    }

    @Override
    public void save(AlumnusEntity alumnusEntity) {

        try {
            alumnusRepo.save(alumnusEntity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


//    @Override
//    public List<AlumnusEntity> findByType(String type) {
//        return alumnusRepo.findByType(type);
//    }

    @Override
    public List<AlumnusEntity> findByGraduationYear(String year) {
        return alumnusRepo.findByGraduationYear(year);
    }

    @Override
    public List<AlumnusEntity> findByGraduationYearAndDistrictAndType(String GraduationYear, String District, String Type) {
        return alumnusRepo.findByGraduationYearAndDistrictAndType(GraduationYear, District, Type);
    }

    @Override
    public void deleteByAlumnusIdCardNumber(String idCard) {
           alumnusRepo.deleteAlumnusEntityByIdCardNumber(idCard);
    }

    @Override
    public AlumnusEntity findByIdCardNumber(String idCard) {
        return alumnusRepo.findByIdCardNumber(idCard).orElse(null);

    }

    @Override
    public void deleteAll() {
        alumnusRepo.deleteAll();
    }

    @Override
    public List<AlumnusEntity> findAll() {
        return alumnusRepo.findAll();
    }
}
