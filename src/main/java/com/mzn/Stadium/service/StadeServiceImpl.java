package com.mzn.Stadium.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mzn.Stadium.entities.Stade;
import com.mzn.Stadium.repos.StadeRepository;

@Service
public class StadeServiceImpl implements StadeService {

    private final StadeRepository stadeRepository;

    public StadeServiceImpl(StadeRepository stadeRepository) {
        this.stadeRepository = stadeRepository;
    }

    @Override
    public Stade saveStade(Stade s) {
        return stadeRepository.save(s);
    }

    @Override
    public Stade updateStade(Stade s) {
        return stadeRepository.save(s);
    }

    @Override
    public void deleteStade(Stade s) {
        stadeRepository.delete(s);
    }

    @Override
    public void deleteStadeById(Long id) {
        stadeRepository.deleteById(id);
    }

    @Override
    public Stade getStade(Long id) {
        return stadeRepository.findById(id).get();
    }

    @Override
    public List<Stade> getAllStades() {
        return stadeRepository.findAll();
    }
}