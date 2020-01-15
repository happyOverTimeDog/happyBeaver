package com.ltm.sms.stumanagesystem.mapper;

import com.ltm.sms.stumanagesystem.domain.entity.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ScoreMapper {
    void addScore(Score score);
    void delScore(Integer id);
    void updateScore(Score score);
    List<Score> getScoreList(Score score);
}
