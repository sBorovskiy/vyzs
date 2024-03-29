package ua.vyz.service;

import ua.vyz.model.Vyz;

import java.util.List;

public interface VyzService {
    List<Vyz> findAll();

    List<Vyz> findAllByTown(String town);

    List<Vyz> getVyzByPassingScore(int passingScore);

    List<Vyz> getVyzByPassingScoreAndTown(int passingScore, String town);

    List<Vyz> getVyzsByFacultetTitle(String facultetTitle);

    List<Vyz> getVyzByAllParams(String facultetTitle, int passingScore, String town);

}