package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.ITransmissionService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.TransmissionRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Transmission;
import org.springframework.stereotype.Service;

@Service
public class TransmissionService implements ITransmissionService {

    private TransmissionRepository transmissionRepository;

    @Override
    public void add(Transmission transmission) {
        transmissionRepository.save(transmission);
    }
}
