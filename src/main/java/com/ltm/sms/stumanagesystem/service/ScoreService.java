package com.ltm.sms.stumanagesystem.service;

import com.ltm.sms.stumanagesystem.domain.entity.Score;

import java.util.List;

public interface ScoreService {
    void addScore(Score score);
    void delScore(Integer id);
    void updateScore(Score score);
    List<Score> getScoreList(Score score);
}
