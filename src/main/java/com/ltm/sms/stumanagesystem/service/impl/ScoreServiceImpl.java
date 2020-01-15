package com.ltm.sms.stumanagesystem.service.impl;

import com.ltm.sms.stumanagesystem.domain.entity.Score;
import com.ltm.sms.stumanagesystem.mapper.ScoreMapper;
import com.ltm.sms.stumanagesystem.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;
    @Override
    public void addScore(Score score) {
        this.scoreMapper.addScore(score);
    }

    @Override
    public void delScore(Integer id) {
        this.scoreMapper.delScore(id);
    }

    @Override
    public void updateScore(Score score) {
        this.scoreMapper.updateScore(score);
    }

    @Override
    public List<Score> getScoreList(Score score) {
        return this.scoreMapper.getScoreList(score);
    }
}
