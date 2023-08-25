package allianz.healthtourism.service;

import allianz.healthtourism.base.BaseService;
import allianz.healthtourism.dto.Request.DoctorRequest;
import allianz.healthtourism.dto.Response.DoctorDTO;
import allianz.healthtourism.entity.Doctor;
import allianz.healthtourism.mapper.ModelMapperManager;
import allianz.healthtourism.repository.DoctorRepository;
import allianz.healthtourism.specification.DoctorSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<Doctor, DoctorDTO, DoctorRequest, DoctorRepository, DoctorSpecification> {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    DoctorSpecification doctorSpecification;


    public DoctorService(ModelMapperManager modelMapperManager) {
        super(modelMapperManager);
    }

    @Override
    protected Class<Doctor> getEntity() {
        return Doctor.class;
    }

    @Override
    protected DoctorRepository getRepository() {
        return doctorRepository;
    }

    @Override
    protected DoctorSpecification getSpecification() {
        return doctorSpecification;
    }

    @Override
    protected Class<DoctorDTO> getDto() {
        return DoctorDTO.class;
    }

    @Override
    protected Class<DoctorRequest> getRequestDto() {
        return DoctorRequest.class;
    }
}
