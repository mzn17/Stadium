package com.mzn.Stadium.service;

import java.util.List;

import com.mzn.Stadium.entities.Stade;

public interface StadeService {

    Stade saveStade(Stade s);

    Stade updateStade(Stade s);

    void deleteStade(Stade s);

    void deleteStadeById(Long id);

    Stade getStade(Long id);

    List<Stade> getAllStades();
}